package sprint3_swing_learning.treadLearing.övning12;

public class Medicine extends Thread{
    public Thread thread = new Thread(this);
    private String type;
    private long interval;
    int numbers;

    public Medicine(String type, long interval){
        this.type = type;
        this.interval = interval*1000;
    }

    @Override
    public void run() {
        //int counter = 0;
        System.out.println("Time to eat "+Thread.currentThread().getName());
       int number = 0;
       while(!Thread.interrupted()){
           try {
               Thread.sleep(interval);
               //counter+=(interval/1000);
               number++;
               System.out.println(number*(interval/1000)+" seconds passed, the "+number+" time to take "+type);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
        System.out.println("Time out on "+Thread.currentThread().getName());
    }
}
