package sprint3_swing_learning.övning2;

import com.sun.javafx.binding.StringFormatter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Form extends JFrame implements ActionListener {

    JPanel layout = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JTextField fieldNow = new JTextField();
    JTextField filedOld = new JTextField();
    JTextField filedLiter = new JTextField();
    JLabel labelNow = new JLabel("Input meter number now:");
    JLabel labelOld = new JLabel("Input meter number old:");
    JLabel labelLiter = new JLabel("Input used oil in liter:");
    JLabel labelDistance = new JLabel("Distance:");
    JLabel labelDistanceData = new JLabel();
    JLabel labelUsedOil = new JLabel("Oil used:");
    JLabel labelUsedOilData = new JLabel();
    JLabel labelPerMil = new JLabel("Per mil oil:");
    JLabel getLabelPerMilData = new JLabel();

    Form(){
        layout.setLayout(new GridLayout(2,1));
        setSize(1000,1000);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        /*fieldNow.setColumns(1);
        filedOld.setColumns(1);
        filedLiter.setColumns(1);*/
        panel1.setLayout(new GridLayout(3,2));
        panel1.add(labelNow);
        panel1.add(fieldNow);
        panel1.add(labelOld);
        panel1.add(filedOld);
        panel1.add(labelLiter);
        panel1.add(filedLiter);
        layout.add(panel1);

        panel2.setLayout(new GridLayout(1,6));
        panel2.add(labelDistance);
        panel2.add(labelDistanceData);
        panel2.add(labelUsedOil);
        panel2.add(labelUsedOilData);
        panel2.add(labelPerMil);
        panel2.add(getLabelPerMilData);
        layout.add(panel2);

        fieldNow.addActionListener(this);
        filedOld.addActionListener(this);
        filedLiter.addActionListener(this);

        add(layout);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Form();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double dataNow = 0;
        double dataOld = 0;
        double dataOil = 0;

        //if(e.getSource().equals(fieldNow)){
            try{
                dataNow = new Scanner(fieldNow.getText()).nextDouble();
            }catch (Exception err){
                JOptionPane.showMessageDialog(null,"Not a number");
            }
        //}
        //if(e.getSource().equals(filedOld)){
            try {
                dataOld = new Scanner(filedOld.getText()).nextDouble();
            }catch (Exception err){
                JOptionPane.showMessageDialog(null,"Not a number");
            }
        //}
        //if(e.getSource().equals(filedLiter)){
            try {
                dataOil = new Scanner(filedLiter.getText()).nextDouble();
            }catch (Exception err){
                JOptionPane.showMessageDialog(null,"Not a number");
            }
        //}
        labelDistanceData.setText(""+(dataNow-dataOld));
        labelUsedOilData.setText(""+dataOil);

        getLabelPerMilData.setText( dataNow-dataOld == 0 ? "": ""+dataOil/(dataNow-dataOld));
    }
}
