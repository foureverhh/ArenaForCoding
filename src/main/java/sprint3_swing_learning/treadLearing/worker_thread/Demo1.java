package sprint3_swing_learning.treadLearing.worker_thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Demo1 extends JFrame implements ActionListener {
    private JTextField t1 = new JTextField(20);
    private JTextField t2 = new JTextField(20);
    private JLabel label = new JLabel("Place for result: ");

    public Demo1(){
        setLayout(new FlowLayout());
        add(t1);add(t2);add(label);
        label.setHorizontalAlignment(JLabel.CENTER);
        t1.addActionListener(this);
        t2.addActionListener(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250,100); setVisible(true);
    }
    //Intern class
    class TextSearching extends SwingWorker<Integer,Void>{
        private String fileName,text;

        public TextSearching(String fileName,String text){
            this.fileName = fileName;
            this.text = text;
        }

        @Override
        protected Integer doInBackground() throws Exception {
            Scanner scanner = new Scanner(new File(fileName));
            int n = 0;
            while(scanner.hasNext()){
                String s = scanner.nextLine();
                for (int i = 0; i <s.length() ; i++) {
                    s.substring(i).startsWith(text);
                    n++;
                }
            }
            return n;
        }

        @Override
        protected void done() {
            try {
                label.setText("There are "+get()+" matching.");
            } catch (InterruptedException e) {
                label.setText("No matching");
            } catch (ExecutionException e) {
                label.setText("No matching");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Scanner scanner = new Scanner(new File(t1.getText()));
            int n =0;
            while (scanner.hasNext()){
                String s = scanner.nextLine();
                for (int i = 0; i < s.length(); i++) {
                    if(s.substring(i).startsWith(t2.getText())){
                        n++;
                    }
                }
            }
            label.setText("There are "+n+" matching.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Demo1();
            }
        });
    }
}
