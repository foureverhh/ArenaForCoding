package genericsDemo;

import java.util.Comparator;

public class OwnComparator<T> {
    public int whichIsBigger(T str1,T str2){
        int result = 0;
       if(str1.getClass() == String.class &&
               str2.getClass() == String.class){
           String temp1 = (String)str1;
           String temp2 = (String)str2;
           result = temp1.compareTo(temp2);
       }else if(str1.getClass() == int.class &&
                str2.getClass() == int.class){
                Integer a = (Integer) str1;
                Integer b = (Integer) str2;
            result = Integer.compare(a,b);
        }
       return result;
    }
}
