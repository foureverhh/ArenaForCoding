package sprint3_swing_learning.treadLearing.producer_consumer_pattern;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    public Thread activity = new Thread(this);
    private String text;
    private long interval;
    private BlockingQueue queue;
    //private SimpleQueue queue;

    //public Producer(String text, long interval, SimpleQueue queue) {
    public Producer(String text, long interval, BlockingQueue queue) {
        this.text = text;
        this.interval = interval*1000;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()){
            try {
                Thread.sleep(interval);
                queue.put(Thread.currentThread().getName()+" "+text);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
