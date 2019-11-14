package sprint4.practice5a.client_send_receive;

import sprint4.practice5a.data.Database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receive implements Runnable{
    private Socket client;
    private BufferedReader br;
    private boolean isRunning;


    public Receive(Socket client) {
        this.client = client;
        isRunning = true;
    }

    @Override
    public void run() {
        while (isRunning) {
            receive();
            System.out.println("Client receive works");
        }

        try {
            br.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void receive(){
        try {
            br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String response = br.readLine();
            if(response==null)
                isRunning = false;
            System.out.println("Server response: "+response);
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
            try {
                br.close();
                if(client!=null)
                    client.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
