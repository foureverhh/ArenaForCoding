package OOPIntro.recursionTest.demo01;

public class App {
    static final double INTEREST = 0.1;
    public static void main(String[] args) {
        double startCapital = 100;
        double myMoney = myCapital(startCapital,3);
        System.out.println(myMoney);
    }

    public static double myCapital(double startCapital, int year){
        if(year == 0){
            return startCapital;
        }else {
            startCapital = startCapital * (1+ INTEREST) ;
            year--;

            return myCapital(startCapital,year);
        }
    }
}
