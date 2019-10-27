package sprint3_swing_learning.treadLearing.thread_swing_direct;

public class Printer implements Runnable{

    public  Thread activity = new Thread(this);
    private String text;
    private long interval;

    public Printer(String text, long interval) {
        this.text = text;
        this.interval = interval*1000;
    }

    public void run() {
        //for (int i = 0; i < 5; i++) {

            while (!activity.isInterrupted()) {
                try {
                    Thread.sleep(interval);
                    System.out.println(text + " ");
                } catch (InterruptedException e) {
                    break;
                }
            }

        //}
    }

    public static void main(String[] args) throws InterruptedException {
        Printer printer1 = new Printer("java",1),
                printer2 = new Printer("C#",2);
        printer1.activity.start();
        printer2.activity.start();
        Thread.sleep(10000);
        printer1.activity.interrupt();
        printer2.activity.interrupt();
    }
}
