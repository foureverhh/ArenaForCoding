package sprint3_swing_learning.jbutton_test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task1_B extends JFrame implements ActionListener {


            int counter =0;
        JLabel icon ;
        JButton button = new JButton("Play");
        JPanel panel ;
        List<Path> pics;

        Task1_B(){
            setSize(1000,1000);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            panel = new JPanel();
            icon = new JLabel("pic");
            button.addActionListener(this);
            panel.add(button);
            panel.add(icon);
            add(panel);
            setVisible(true);
            pics = new ArrayList<>();
            collectImagPaths();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(button)){
                button.setText("Next");
                counter = (counter+1) % pics.size();
                System.out.println(pics.size());
                ImageIcon imageIcon = new ImageIcon(pics.get(counter).toString());
                System.out.println(counter);
                System.out.println(pics.get(counter).toString());
                icon.setIcon(imageIcon);
            }
        }

        public void collectImagPaths(){
            Path dir = Paths.get("/Users/foureverhh/ArenaForCoding/src/main/resources");
            try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dir,"*.jpg")){
                for(Path entry : directoryStream){
                    pics.add(entry);
                }
            } catch (IOException ex) {
                    ex.printStackTrace();
            }
        }

        public static void main(String[] args) {
            new Task1_B();
        }

}
