package sprint4.practice5a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",8000);
        System.out.println("Input a name:");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String userInput = input.readLine();
        //Client write user input to server
        PrintWriter pw = new PrintWriter(client.getOutputStream());
        pw.println(userInput);
        System.out.println(userInput);
        pw.flush();

        //Client read feedback from server
        input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String response = input.readLine();
        System.out.println("Server response: "+response);

        pw.close();
        input.close();

    }
}
