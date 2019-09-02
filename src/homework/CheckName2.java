package homework;

import javax.swing.*;

public class CheckName2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input your first name and last name, please.");
        while (true){
            //Handle no input
            if(name == null || name.isEmpty()){
                JOptionPane.showMessageDialog(null,"A name is needed!",
                        "Error",JOptionPane.ERROR_MESSAGE);
                name = JOptionPane.showInputDialog("A name is needed, please.");
            }
            //Check input length, name can not empty or more than 20 letters
            else if(name.trim().length()>20){
                JOptionPane.showMessageDialog(null,"Name can not be more than 20 letters",
                        "Error",JOptionPane.ERROR_MESSAGE);
                name = JOptionPane.showInputDialog("Input your name less than 20 letters, please.");
            }
            //No middle name is needed in input
            else if(name.trim().substring(name.trim().indexOf(" ")).trim().contains(" ")){
                JOptionPane.showMessageDialog(null,"Middle name is not needed",
                        "Error",JOptionPane.ERROR_MESSAGE);
                name = JOptionPane.showInputDialog("No middle name is needed, please.");
            }
            //Handle no after name case
            else if(!name.contains(" ")){
                JOptionPane.showMessageDialog(null,"Both first and last name are needed",
                        "Error",JOptionPane.ERROR_MESSAGE);
                name = JOptionPane.showInputDialog("Both first and last name are needed, please.");
            }
            //Make name into lower case
            else{
                name = name.toLowerCase();
                break;
            }


        }
        //Convert å,ä,ö into a and o respective
        if(name.contains("å")){
            name = name.replace('å','a');
        }
        if(name.contains("ä")){
            name = name.replace('ä','a');
        }
        if(name.contains("ö")){
            name = name.replace('ö','o');
        }

        //Get first name and last name
        String firstName = name.trim().substring(0,name.trim().indexOf(" "));
        String lastName = name.trim().substring(name.trim().indexOf(" ")+1);
        JOptionPane.showMessageDialog(null,firstName+"."+lastName+"@yh.nackademin.se");
    }
}
