package sprint4.practice5a;

import sprint4.practice5a.data.Database;
import sprint4.practice5a.data.Person;

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
        //Build up socket
        Socket client = server.accept();
        System.out.println("--------------client connect-------------");
        //Get input from client
        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String userInquire = reader.readLine();
        System.out.println("User requires: "+userInquire);
        //Check database
        Database database = new Database();
        Person p =database.getPerson(userInquire);
        //Give response
        PrintWriter ps = new PrintWriter(client.getOutputStream());
        if(p!=null){
            ps.println(p.toString());
            ps.flush();
        }else {
            ps.write("No result");
            ps.flush();
        }

        ps.close();
        reader.close();
    }
}
