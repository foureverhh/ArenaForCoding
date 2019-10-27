package sprint3_swing_learning.radio_button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButton red = new JRadioButton("RED",false);
    JRadioButton yellow = new JRadioButton("YELLOW",false);
    JRadioButton green = new JRadioButton("GREEN",false);
    JLabel label = new JLabel();

    RadioButton(){
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel.setLayout(new GridLayout(4,1));
        buttonGroup.add(red);
        buttonGroup.add(yellow);
        buttonGroup.add(green);
        panel.add(red);
        panel.add(yellow);
        panel.add(green);
        label.setText("Show color");
        label.setForeground(Color.WHITE);
        panel.add(label);
        add(panel);
        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);
        setVisible(true);
    }
    public static void main(String[] args) {
        new RadioButton();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(red)){
            label.setForeground(Color.RED);
        }else if(e.getSource().equals(green)){
            label.setForeground(Color.GREEN);
        }else if(e.getSource().equals(yellow)){
            label.setForeground(Color.YELLOW);
        }else
            label.setForeground(Color.WHITE);
    }
}
