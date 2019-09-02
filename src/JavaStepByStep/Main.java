package JavaStepByStep;


import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Input your first name and last name, please.");
        try{
            if(name ==  null){
                System.exit(0);
            }
            //Handle
            if(name.isEmpty()|| name.trim().length()>20){
                throw new TooLongException();
            }
            //Handle middle name case
            if(!name.contains(" ")){
                throw new NoAfterNameException();
            }
            //Handle no after name case
            if(name.trim().substring(name.trim().indexOf(" ")).trim().contains(" ")){
                throw new MiddleNameException();
            }
        }catch (TooLongException e) {
            JOptionPane.showMessageDialog(null,"Input can not empty or more than 20 letters",
                    "Error",JOptionPane.ERROR_MESSAGE);
            name = JOptionPane.showInputDialog("Name should not longer than 20 letters");
        }catch (MiddleNameException e){
            JOptionPane.showMessageDialog(null,"Middle name is not needed",
                    "Error",JOptionPane.ERROR_MESSAGE);
            name = JOptionPane.showInputDialog("Just input first name and last name,please.");
        }catch (NoAfterNameException e){
            JOptionPane.showMessageDialog(null,"After name is needed as well!",
                    "Error",JOptionPane.ERROR_MESSAGE);
            name = JOptionPane.showInputDialog("Do not forget to input your after name, please.");
        }

        name = name.toLowerCase();
        /*
        while (true){
            //Check input length, name can not empty or more than 20 letters
            if(name==null||name.isEmpty()|| name.trim().length()>20){
                JOptionPane.showMessageDialog(null,"Input can not empty or more than 20 letters",
                        "Error",JOptionPane.ERROR_MESSAGE);
                name = JOptionPane.showInputDialog("Input your first name and last name again, please.");
            }//No middle name is needed in input
            else if(name.trim().substring(name.trim().indexOf(" ")).trim().contains(" ")){
                JOptionPane.showMessageDialog(null,"Middle name is not needed",
                        "Error",JOptionPane.ERROR_MESSAGE);
                name = JOptionPane.showInputDialog("Input your first name and last name again, please.");
            }//Make name into lower case
            else{
                name = name.toLowerCase();
                break;
            }
        }
        */
        //Convert å,ä,ö into a and o respective
        if(name.contains("å"))
            name = name.replace('å','a');
        if(name.contains("ä"))
            name = name.replace('ä','a');
        if(name.contains("ö"))
            name = name.replace('ö','o');

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