package sprint4.practice5a;

import sprint4.practice5a.data.Database;
import sprint4.practice5a.data.Person;
import sprint4.practice5a.server_channel.Channel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(8000);
        System.out.println("--------------server start--------------");
        while (true){
            Socket client = server.accept();
            System.out.println("--------------one client connect-------------");
            new Thread(new Channel(client)).start();
        }
       /* BufferedReader reader = null;
        PrintWriter pw = null;
        Socket client = server.accept();
        System.out.println("--------------client connect-------------");
        boolean isRunning = true;
        while (isRunning){
            //Build up socket
            //Get input from client
            reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String userInquire = reader.readLine();
            if(userInquire == null)
                break;
            System.out.println("User requires: " + userInquire);
            //Check database
            Database database = new Database();
            Person p = database.getPerson(userInquire);
            //Give response
            pw = new PrintWriter(client.getOutputStream());
            if (p != null) {
                pw.println(p.toString());
                pw.flush();
            } else {
                pw.println("No result");
                pw.flush();
            }
        }
        pw.close();
        reader.close();
        //server.close();*/
    }
}
