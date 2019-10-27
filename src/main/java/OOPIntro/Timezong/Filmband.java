package OOPIntro.Timezong;

import javax.swing.*;
import java.security.interfaces.DSAPublicKey;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Filmband {

    public static void main(String[] args) {
        long durationInMinutes = getLength();
        LocalTime startTime = LocalTime.of(12,15,00);
        LocalTime currentTime = LocalTime.of(12,30,00);
        Duration duration = Duration.between(startTime,currentTime);
        long playTimeInMinutes = duration.toMillis();
        long leftTime = durationInMinutes- playTimeInMinutes;
        int minutes =(int) leftTime/60/1000;
        int seconds =(int) leftTime%(60*1000);
        JOptionPane.showMessageDialog(null,minutes+":"+seconds);
    }

    public static long getLength(){
        String input = JOptionPane.showInputDialog("Input length in minutes");
        long seconds = 0;
        while (true){
            if(input == null){
                int choice = JOptionPane.showConfirmDialog(null,"Do you want to quit?","QUIT",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
            else if(input.isEmpty()){
                input = JOptionPane.showInputDialog("Input a valid length please!");
            }
            else {
                try {
                    if(input.contains(".")){
                        String[] length = input.split(".");
                        seconds = Long.parseLong(length[0])*60*1000+Long.parseLong(length[1])*1000;
                        break;
                    }else if(input.contains(",")){
                        String[] length = input.split(",");
                        seconds = Long.parseLong(length[0])*60*1000+Long.parseLong(length[1])*1000;
                        break;
                    }else {
                        seconds = Long.parseLong(input)*60*1000;
                        break;
                    }
                }catch (Exception e){
                    input = JOptionPane.showInputDialog("Input a valid length please!");
                }
            }
        }
        return seconds;
    }

}
