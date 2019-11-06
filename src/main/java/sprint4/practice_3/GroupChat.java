package sprint4.practice_3;

import javax.swing.*;

import java.awt.*;


public class GroupChat extends JFrame {
    private JButton cancel;
    private JTextArea board;
    private JTextField input;
    private JButton ok;

    private JPanel panel;
    private JPanel inputPanel;
    private JScrollPane scrollPane;


    public GroupChat() {
        setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        cancel = new JButton("Cancel");
        board = new JTextArea("Hello world!",30,40);
        board.setLineWrap(true);
        board.setWrapStyleWord(true);
        input = new JTextField(30);
        ok = new JButton("Ok");

        panel.setLayout(new BorderLayout());
        panel.add(cancel,BorderLayout.NORTH);
        inputPanel = new JPanel();
        inputPanel.add(input);
        inputPanel.add(ok);
        scrollPane = new JScrollPane(board);
        panel.add(scrollPane,BorderLayout.CENTER);
        panel.add(inputPanel,BorderLayout.SOUTH);
        add(panel);


        ok.addActionListener( l ->{
                String msg = input.getText();
                new Thread(new Send("Haha", msg, 6666, 7777)).start();

                Receive receive = new Receive("Haha",7777);
                new Thread(receive).start();
                String str = receive.getMsg();
                board.append(str);
                board.append("\n");
        });

        cancel.addActionListener(l->{
            Send item = new Send("Haha"," ",6666,7777);
            item.breakDown();
            new Thread(item).start();
        });
        setVisible(true);
    }


    public static void main(String[] args) {
        new GroupChat();

    }
}
