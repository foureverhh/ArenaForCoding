package OOPIntro.Timezong;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;

public class TimeChecker {
    public static void main(String[] args) {
        String city = JOptionPane.showInputDialog("Set your city:（Shanghai, NewYork）");
        Set<String> timeZones = ZoneId.getAvailableZoneIds();
        ZoneId cityTimeZone = null;

            while (city.isEmpty() || cityTimeZone == null){
                for (String timeZone : timeZones) {
                    if (timeZone.contains(city)) {
                        cityTimeZone = ZoneId.of(timeZone);
                        break;
                    }
                }
                city = JOptionPane.showInputDialog("Set your city:");
            }
            LocalDateTime localDateTime = LocalDateTime.now();
            ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, cityTimeZone);
            //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("The local time in yyyy-MM-dd HH:mm:ss");
            //String msg = zonedDateTime.format(formatter);
            String msg = "The local time in "+city+zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssZ"));
            JOptionPane.showMessageDialog(null, msg, "Localtime", JOptionPane.INFORMATION_MESSAGE);
        }

}
