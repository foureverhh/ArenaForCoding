package sprint3_swing_learning.event_listener.anonymous_class;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame {

    JCheckBox yes;
    JCheckBox no;
    JLabel label;
    JPanel panel;

    CheckBox(){
        yes = new JCheckBox("YES",false);
        no = new JCheckBox("No",false);
        label = new JLabel("Choice");
        panel = new JPanel();
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==yes){
                    label.setText("YES");
                }
            }
        });
        no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==no){
                    label.setText("NO");
                }
            }
        });
        panel.add(yes);
        panel.add(no);
        panel.add(label);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBox();
    }
}
