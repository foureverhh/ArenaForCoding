package javaIntro.JavaStepByStep.formatting;

public class App {

    public static void main(String[] args) {
        System.out.printf("%20s%22s\n","n","2^n");
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%20d%,20.0f\n",i,Math.pow(2,i));
        }
    }





















/*    public static void main(String[] args) {
        System.out.printf("%20s%22s\n","n","2^n");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%20d%,20.0f\n",i,Math.pow(2,i));
        }


    }*/
}
