package sprint3_swing_learning.övning4;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

    JFrame frame;
    JTextArea textArea;
    JPanel panel1;
    JPanel panel2;
    JLabel label;
    JTextField searchZone;
    JButton open;
    JButton save;
    JButton print;
    JButton end;
    JPanel panelAll;
    JScrollPane scrollPane;

    App(){
        frame = new JFrame("File Handler");
        textArea = new JTextArea(50,60);
        panel1 = new JPanel();
        panel2 = new JPanel();
        label = new JLabel("File name:");
        searchZone = new JTextField();
        open = new JButton("OPEN");
        save = new JButton("SAVE");
        print = new JButton("Print");
        end = new JButton("END");

        open.addActionListener(l->{
            String path = searchZone.getText().trim();
            Path filePath = Paths.get(path);
            try(BufferedReader reader = Files.newBufferedReader(filePath)){
                textArea.read(reader,null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        save.addActionListener(l->{
            String path = searchZone.getText().trim();
            Path filePath = Paths.get(path);
           // String content = textArea.getText();
            try(BufferedWriter writer = Files.newBufferedWriter(filePath)){
                textArea.write(writer);
              /*  writer.write(content);
                writer.flush();*/
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        print.addActionListener(l->{
            try {
                textArea.print();
            } catch (PrinterException e) {
                e.printStackTrace();
            }
        });

        end.addActionListener(l->{
            System.exit(0);
        });
        panel1.setLayout(new GridLayout(1,6));
        panel1.add(label);
        panel1.add(searchZone);
        panel1.add(open);
        panel1.add(save);
        panel1.add(print);
        panel1.add(end);


        scrollPane = new JScrollPane(textArea);
        //scrollPane.setViewportView(textArea);
        panel2.add(scrollPane);
        panelAll = new JPanel();
        panelAll.setLayout(new BoxLayout(panelAll, BoxLayout.Y_AXIS));
        panelAll.add(panel1);
        panelAll.add(panel2);
        frame.add(panelAll);

        frame.setSize(100,100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new App();
    }
}
