package sprint3_swing_learning.treadLearing.thread_swing_direct;

public class Account {
    private double amount;

    public synchronized void transaction(double money){
        if(amount<0 && amount+money<0){
            System.out.println("can not transfer");
        }else {
            amount =amount+money;
        }
    }

}
