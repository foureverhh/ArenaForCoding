package sprint3_swing_learning.checkBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class App extends JFrame implements ActionListener {


    JCheckBox red = new JCheckBox("RED",false);
    JCheckBox yellow = new JCheckBox("YELLOW",false);
    JCheckBox blue = new JCheckBox("BLUE",false);
    JPanel panel = new JPanel();
    JLabel jLabel = new JLabel();

    public static void main(String[] args) {
        new App();
    }

    App(){
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel.setLayout(new GridLayout(4,1));
        panel.add(red);
        panel.add(yellow);
        panel.add(blue);
        panel.add(jLabel);
        this.add(panel);

  /*      red.addItemListener(this);
        yellow.addItemListener(this);
        blue.addItemListener(this);*/
        red.addActionListener(this);
        yellow.addActionListener(this);
        blue.addActionListener(this);
        jLabel.setText("I am a label");
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(red.isSelected() && yellow.isSelected() && blue.isSelected()){
            panel.setBackground(new Color(165,42,42));
            jLabel.setText("Brown");
        }else if(red.isSelected()){
            panel.setBackground(Color.RED);
            jLabel.setText(e.getSource().getClass().getName());
        }else if(yellow.isSelected()){
            jLabel.setText("yellow");
            panel.setBackground(Color.YELLOW);
        }
        else if(blue.isSelected()){
            jLabel.setText("blue");
            panel.setBackground(Color.BLUE);
        }else {
            jLabel.setText("No color");
            panel.setBackground(Color.WHITE);
        }
    }


    /*@Override
    public void itemStateChanged(ItemEvent e) {
        if(red.isSelected() && blue.isSelected() && yellow.isSelected()){
            jLabel.setText("Brown");
        }
    }*/
}
