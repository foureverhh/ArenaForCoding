package sprint4.practice5a;

import sprint4.practice5a.client_send_receive.Receive;
import sprint4.practice5a.client_send_receive.Send;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",8000);
        System.out.println("Input a user name:");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String userInput = input.readLine();
        //Client write user input to server

            new Thread(new Send(userInput,client)).start();
        /*
        PrintWriter pw = new PrintWriter(client.getOutputStream());
        pw.println(userInput);
        pw.flush();*/
            //
            //Client read feedback from server
            new Thread(new Receive(client)).start();

 /*
        input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String response = input.readLine();
        System.out.println("Server response: "+response);

        pw.close();
        input.close();*/

    }
}
