package sprint4.practice5a.server_channel;

import sprint4.practice5a.data.Database;
import sprint4.practice5a.data.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Struct;

public class Channel implements Runnable {
    private Socket server;
    private PrintWriter pw;
    private BufferedReader br;
    private Database database;
    private boolean isRunning;
    private String username;
    public Channel(Socket socket){
        this.server = socket;
        database = new Database();
        isRunning = true;
        try {
            br = new BufferedReader(new InputStreamReader(server.getInputStream()));
            pw = new PrintWriter(server.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problem in constructor");
            try {
                isRunning = false;
                br.close();
                pw.close();
                server.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        username = receive();
    }

    @Override
    public void run() {
        while (isRunning){
            String msg = receive();
            System.out.println(username+" checked: "+msg);
            send(msg);
        }
    }
    //Get the name need to be inquired
    String receive(){
        String userInquire = "";
        try {
         userInquire =  br.readLine();
         if(userInquire==null) {
             userInquire = "nothing, and "+username+" quit.";
             isRunning = false;
         }
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
            try {
                br.close();
                pw.close();
                server.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return userInquire;
    }

    void send(String msg){
        msg = checkPerson(msg);
        pw.println(msg);
        pw.flush();
    }

    String checkPerson(String name){
        String personInfo = "No info of this person";
        Person p = database.getPerson(name);
        if(p!=null){
            personInfo = p.toString();
        }
        return personInfo;
    }
}
