package OOPIntro.recursionTest.demo03;

public class App {
    public static void main(String[] args) {
        int first = 0, second =1,times = 10;

        System.out.println(fibonacci(first,second,times));
    }

    public static int fibonacci(int first,int second,int times){

        if(times == 0){
            return first;
        }
        int temp = first;

        first = first + second;
        second = temp;
        times--;
        System.out.println(first+" "+second);
        return fibonacci(first,second,times);
    }
}

