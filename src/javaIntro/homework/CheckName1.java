package javaIntro.homework;



import javax.swing.*;

public class CheckName1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input your first name and last name, please.");
        while(true) {
            try {
                //Handle no input
                if (name == null||name.trim().isEmpty()) {
                    name = JOptionPane.showInputDialog("A name must be input, please.");
                }
                //Handle name is longer than 20 letters
                else if ( name.trim().length() > 20) {
                    throw new TooLongException();
                }
                //Handle middle name case
                else if (!name.contains(" ")) {
                    throw new NoAfterNameException();
                }
                //Handle no after name case
                else if (name.trim().substring(name.trim().indexOf(" ")).trim().contains(" ")) {
                    throw new MiddleNameException();
                }
                //Make name into lowercase
                else{
                    name = name.toLowerCase();
                    break;
                }
            } catch (TooLongException e) {

                name = JOptionPane.showInputDialog("Name should not longer than 20 letters");
            } catch (MiddleNameException e) {
                JOptionPane.showMessageDialog(null, "Middle name is not needed",
                        "Error", JOptionPane.ERROR_MESSAGE);
                name = JOptionPane.showInputDialog("Just input first name and last name,please.");
            } catch (NoAfterNameException e) {
                JOptionPane.showMessageDialog(null, "After name is needed as well!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                name = JOptionPane.showInputDialog("Do not forget to input your after name, please.");
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


class TooLongException extends Exception{

}

class MiddleNameException extends Exception{

}

class NoAfterNameException extends Exception{

}
