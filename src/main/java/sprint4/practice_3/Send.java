package sprint4.practice_3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Send implements Runnable {
    String userName;
    MulticastSocket multicastSocket;
    DatagramSocket socket;
    DatagramPacket packet;
    InetAddress host;
    String msg;
    int port;
    int targetPort;

    public Send(String userName,String msg,int port,int targetPort) {
        this.userName = userName;
        this.msg = userName+": "+msg;
        this.port = port;
        this.targetPort = targetPort;
        try {
            //host = InetAddress.getByName("234.235.236.237");
            host = InetAddress.getByName("127.0.0.1");
            System.out.println("host is: "+host);
            socket = new DatagramSocket(port);
            //multicastSocket = new MulticastSocket(12540);
            //multicastSocket.joinGroup(host);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            //while (true) {
            byte[] data = msg.getBytes();
            //packet = new DatagramPacket(data,data.length,host,12540);
            packet = new DatagramPacket(data, data.length, host, targetPort);
            //multicastSocket.send(packet);
            socket.send(packet);
            System.out.println(msg+" in Send");

                /*if(msg.contains("bye"))
                    break;*/
            //}
        } catch (IOException e) {
            e.printStackTrace();
        }
        socket.close();
    }

    public void breakDown(){
        // try {
        //multicastSocket.leaveGroup(host);
        msg = userName+" : has left.";
       /*     } catch (IOException e) {
                e.printStackTrace();
            }*/
    }
}