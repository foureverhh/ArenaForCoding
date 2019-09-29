package javaIntro.homework;

import javax.swing.*;

public class numberTest {
    public static void main(String[] args) {
        double price = 0;

        String input = JOptionPane.showInputDialog("Input pris:");
        while(true) {
            try {
                if(input == null){
                    System.exit(0);
                }
                price = Double.parseDouble(input);
                break;
            } catch (Exception e) {
                input = JOptionPane.showInputDialog("Input price in number please");
            }
        }

        showPrice(price);
    }

    static void showPrice(double price){
        JOptionPane.showMessageDialog(null,"Price is: "+price);
    }


}
