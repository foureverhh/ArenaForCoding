package javaIntro.day26;

public class App {
    public static void main(String[] args) {
        int[] numbers = {12,5, 7};


        for(int m =0;m<3;m++){
            boolean notPrime =false;
            if(numbers[m]<=3){
                if(numbers[m] > 1){
                    System.out.println("Prime");
                }else{
                    System.out.println("Not prime");
                }
            }else{
                for(int i=2;i<=(int)Math.sqrt(numbers[m]);i++){
                    if(numbers[m] % i == 0){
                        notPrime = true;
                        break;
                    }
                }
                System.out.println(notPrime ? "Not prime" : "Prime");
            }
        }
    }
}
