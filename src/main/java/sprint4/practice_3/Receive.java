package sprint4.practice_3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive implements Runnable {
    private DatagramSocket socket;
    private DatagramPacket packet;
    private String username;
    private int port;
    private String msg;
    private byte[] container;

    public Receive(String username, int port) {
        this.username = username;
        this.port = port;
        try {
            socket = new DatagramSocket(port);
            container = new byte[1024];
            packet = new DatagramPacket(container,0,container.length);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            socket.receive(packet);
            byte[] data = packet.getData();
            msg = new String(data, 0, packet.getLength());
            System.out.println(msg+" in receive");
                 /*   if(msg.contains("bye"))
                        break;*/

        } catch (IOException e) {
            e.printStackTrace();
        }
        socket.close();
    }

    public String getMsg() {
        return msg;
    }
}
