package sprint3_swing_learning.combo_box;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxTest extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JComboBox chooser;
    String[] optionSource = new String[]{" ","RED","GREEN","BLUE"};
    JLabel label = new JLabel("CHOICE");

    ComboBoxTest(){
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        chooser = new JComboBox(optionSource);
        chooser.setSelectedIndex(-1);
        chooser.setEditable(true);
        panel.setLayout(new GridLayout(2,1));
        panel.add(chooser);
        panel.add(label);

        chooser.addActionListener(this);
        add(panel,BorderLayout.NORTH);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(chooser.getSelectedItem().equals("RED")){
            label.setForeground(Color.RED);
        }
        if(chooser.getSelectedItem().equals("GREEN")){
            label.setForeground(Color.GREEN);
        }
        if(chooser.getSelectedItem().equals("BLUE")){
            label.setForeground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ComboBoxTest();
    }
}
