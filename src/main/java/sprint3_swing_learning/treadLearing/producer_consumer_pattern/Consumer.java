package sprint3_swing_learning.treadLearing.producer_consumer_pattern;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    public Thread activity = new Thread(this);

    //private SimpleQueue queue;
    private BlockingQueue queue;
    private long interval;

    //public Consumer( long interval,SimpleQueue queue) {
    public Consumer( long interval,BlockingQueue queue) {
        this.queue = queue;
        this.interval = interval * 1000;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()){
            try {
                Thread.sleep(interval);
                String msg = (String) queue.take();
                System.out.println(Thread.currentThread().getName()+" returns "+msg);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

}
