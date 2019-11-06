package sprint3_swing_learning.jbutton_test;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Task1_A extends JFrame implements ActionListener {
    JLabel icon = new JLabel();
    JButton button = new JButton("show icon");
    JPanel panel = new JPanel();
    int counter = 0;

    Task1_A(){
        setSize(1000,1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        icon = new JLabel("pic");
        button.addActionListener(this);
        panel.add(button);
        panel.add(icon);
        add(panel);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button) && counter%2==0){
            counter++;
           /*
           ImageIcon imageIcon2 = new ImageIcon("https://images.app.goo.gl/NhjiD48Yer9S1M4Z8");
            icon = new JLabel(imageIcon2);
            */

            URL url1 = null;
            try {
                url1 = new URL("https://www.twentyonepilots.com/sites/g/files/g2000004896/f/styles/media_gallery_large/public/sample001.jpg?itok=Jx0olYWO");
                BufferedImage image1 = ImageIO.read(url1);
                ImageIcon imageIcon1 = new ImageIcon(image1);
                icon.setIcon(imageIcon1);
            } catch (MalformedURLException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            //ImageIcon imageIcon1 = new ImageIcon("https://www.twentyonepilots.com/sites/g/files/g2000004896/f/styles/media_gallery_large/public/sample001.jpg?itok=Jx0olYWO");
                //icon.setIcon(imageIcon1);

        }else if(e.getSource().equals(button) && counter%2!=0){
            counter++;
            URL url2 = null;
            try {
                url2 = new URL("https://www.twentyonepilots.com/sites/g/files/g2000004896/f/Sample-image10-highres.jpg");
                BufferedImage image2 = ImageIO.read(url2);
                ImageIcon imageIcon2 = new ImageIcon(image2);
                icon.setIcon(imageIcon2);
            } catch (MalformedURLException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            //ImageIcon imageIcon2 = new ImageIcon("https://www.twentyonepilots.com/sites/g/files/g2000004896/f/Sample-image10-highres.jpg");
               // icon.setIcon(imageIcon2);

        }
    }

    public static void main(String[] args) {
        new Task1_A();
    }
}
