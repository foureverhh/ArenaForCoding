package sprint3_swing_learning.event_listener.inner_class;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioBox extends JFrame {

    JRadioButton yes;
    JRadioButton no;
    JPanel panel;
    JLabel label;
    ButtonGroup buttonGroup;
    int num;

    RadioBox(){
        num= 5;
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        yes = new JRadioButton("YES",false);
        no = new JRadioButton("NO",false);
        label = new JLabel("Choice");
        panel = new JPanel();
        buttonGroup = new ButtonGroup();
        MyListener listener = new MyListener();
        yes.addActionListener(listener);
        no.addActionListener(listener);
        buttonGroup.add(yes);
        buttonGroup.add(no);
        panel.add(yes);
        panel.add(no);
        panel.add(label);
        add(panel);

        setVisible(true);
    }

    class MyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == yes){
                label.setText("YES"+num);
            }
            if(e.getSource()==no){
                label.setText("NO"+num);
            }
        }
    }

    public static void main(String[] args) {
        new RadioBox();
    }
}
