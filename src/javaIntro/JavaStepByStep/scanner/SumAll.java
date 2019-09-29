package javaIntro.JavaStepByStep.scanner;

import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        //System.out.println("Sum in sum1 is"+sum1());
        //System.out.println("Sum in sum2 is"+sum2());
        System.out.println(sum2());
    }

    public static int sum1(){
        System.out.println("Sum 1");
        System.out.println("Input numbers:");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String line = null;
        while(!(line =sc.nextLine()).equals("") ){
            sum+=Integer.parseInt(line);
        }
        return sum;
    }

    public static int sum2(){
        System.out.println("Sum 2");
        System.out.println("Input numbers:");
        int sum = 0;
        while(true){
            Scanner sc = new Scanner(System.in);
            String nextLine = sc.nextLine();
            String[] strings =null;
            if(nextLine.isEmpty()){
                break;
            }else{
                strings = nextLine.split(" ");
                for(String item:strings){
                    sum+=Integer.parseInt(item);
                }
            }
        }
        return sum;
    }

    public static int max(){
        System.out.println("Input numbers:");
        Scanner sc = new Scanner(System.in);
        int max = 0,input = 0;
        while (true){
            String line = sc.nextLine();
            if(line.isEmpty()){
                break;
            }
            input = Integer.parseInt(line);
            System.out.println(input);
            if(input>max){
                max = input;
            }
        }
        return max;
    }
}
