package sprint3_swing_learning.event_listener.lambda_express;

import sprint3_swing_learning.event_listener.anonymous_class.CheckBox;

import javax.swing.*;
import java.awt.*;

public class ComboBox extends JFrame {

    JComboBox chooser;
    String[]  choices = {"YES","NO"};
    JLabel label;
    JPanel panel;

    ComboBox(){
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new JPanel();
        label = new JLabel("Choice");
        chooser = new JComboBox(choices);
        chooser.setEditable(true);
        chooser.setSelectedIndex(-1);
        chooser.addActionListener(l->{
            if(chooser.getSelectedIndex() == 0){
                label.setText(chooser.getSelectedItem().toString());
            }
            if(chooser.getSelectedItem().equals("NO")){
                label.setText("No");
            }
        });
        panel.add(chooser);
        panel.add(label);
        panel.setLayout(new GridLayout(2,1));
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}
