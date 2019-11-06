package sprint3_swing_learning.treadLearing.producer_consumer_pattern;

import java.util.Scanner;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class OleDoleDoff {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
       // SimpleQueue container = new SimpleQueue();
        //Use BlockingQueue to replace SimpleQueue
        BlockingQueue<String> container = new LinkedBlockingQueue<String>();
        System.out.println("Input the amount of producers:");
        int producersAmount = scanner.nextInt();
        Producer[] producers = new Producer[producersAmount];
        for (int i = 0; i < producers.length; i++) {
            System.out.println("Producer nr: "+(i+1));
            System.out.print("  Interval:"); System.out.flush();
            long interval = scanner.nextLong();
            System.out.print("  Text:");System.out.flush();
            String text = scanner.next();
            producers[i] = new Producer(text,interval,container);
            producers[i].activity.setName("Producer "+i);
        }

        System.out.println("Input the amount of consumers:");
        int consumersAmount = scanner.nextInt();
        Consumer[] consumers = new Consumer[consumersAmount];
        for (int i = 0; i < consumers.length; i++) {
            System.out.println("Consumer nr: "+(i+1));
            System.out.print("  Interval:");System.out.flush();
            long interval = scanner.nextLong();
            consumers[i] = new Consumer(interval,container);
            consumers[i].activity.setName("Consumer "+i);
        }

        for (Producer producer: producers) {
            producer.activity.start();
        }
        for(Consumer consumer : consumers){
            consumer.activity.start();
        }

        Thread.sleep(60000);
        System.out.println("\nItems in simple queue: "+container.size());
        System.exit(0);
    }
}
