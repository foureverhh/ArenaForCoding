package sprint4.practice5a.client_send_receive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Send implements Runnable{
    private Socket client;
    private PrintWriter pw;
    private BufferedReader br;
    private String name;
    private boolean isRunning;
    private String msg;
    public Send(String name,Socket client) {
        this.name = name;
        this.client = client;
        isRunning = true;
        send(name);

    }

    @Override
    public void run() {
       while (isRunning) {
           System.out.println("Input the name you want to check:");
           br = new BufferedReader(new InputStreamReader(System.in));
           try {
               msg = br.readLine();
           } catch (IOException e) {
               e.printStackTrace();
           }
            send(msg);
       }
        try {
            pw.close();
            br.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void send(String msg){

        try {
            pw = new PrintWriter(client.getOutputStream(),true);
            if(msg!=null && !msg.isEmpty())
                pw.println(msg);
            else if(msg.contains("bye"))
                isRunning = false;
            System.out.println("Send send() works");
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
            try {
                br.close();
                pw.close();
                client.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
