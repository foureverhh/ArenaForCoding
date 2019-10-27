package OOPIntro.scannerTest;


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Input in format a ? b");
            Scanner scanner = new Scanner(System.in);
            try {
                int a = scanner.nextInt();
                char t = scanner.next().charAt(0);
                int b = scanner.nextInt();
                switch (t) {
                    case '+':
                        System.out.println(a + b);
                        break;
                    case '-':
                        System.out.println(a - b);
                        break;
                    case '*':
                        System.out.println(a * b);
                        break;
                    case '/':
                        if (b == 0) {
                            try {
                                bIsZero();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                continue;
                            }
                        }
                        double result = (double) a / b;
                        System.out.println(result);
                        break;
                    default:

                        throw new OperationNotSupportException();

                }
            } catch (Exception e) {
                System.out.println("format error");
            }
        }
    }

    static void bIsZero() throws Exception {
        throw  new Exception("b can not be zero in division");
    }
    static class OperationNotSupportException extends Exception{

    }
}
