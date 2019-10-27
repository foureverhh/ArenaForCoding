package javaIntro.recursionSample;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    static int index = 0;
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(count(0,1));
        System.out.println(result);
    }

    public static int count(int number1,int number2 ){

        if(index <= 10){
            result.add(number1);
            //System.out.println(number1);

            int temp = number1;
            number1 = number1+number2;
            number2 = temp;
            index++;
            return count(number1,number2);
        }else{
          return number1;
        }

    }
}
