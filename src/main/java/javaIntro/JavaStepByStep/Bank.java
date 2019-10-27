package javaIntro.JavaStepByStep;

public class Bank {
    public static void main(String[] args) {
        double base = 1000;

        double interest = 0.07;
        int year = 1;

        for(int i=0;i<year;i++){
            base = base*(1+interest);
        }
        System.out.println(base);
    }
}
