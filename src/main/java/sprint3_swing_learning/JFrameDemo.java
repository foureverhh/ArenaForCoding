package sprint3_swing_learning;

import com.sun.deploy.config.JfxRuntime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDemo extends JFrame {
    JFrameDemo(){
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(300,300);
        //setLocation(d.width/2-this.getWidth()/2,d.height/2-this.getHeight()/2);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        JLabel jLabel = new JLabel("I'm a label");
        jLabel.setForeground(Color.RED);
        JButton button = new JButton("click");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource().equals(button)){
                    jLabel.setForeground(Color.DARK_GRAY);
                }
            }
        });
        jPanel.add(jLabel);
        jPanel.add(button);
        this.add(jPanel);
        this.setTitle("First JFrame");
        jPanel.setBackground(Color.BLUE);
        //pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrameDemo g = new JFrameDemo();
    }
}
