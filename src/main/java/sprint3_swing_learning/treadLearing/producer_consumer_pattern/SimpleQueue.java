package sprint3_swing_learning.treadLearing.producer_consumer_pattern;

import java.util.List;
import java.util.Vector;

public class SimpleQueue {
    private List<Object> list = new Vector<>();

    public int size(){
        return list.size();
    }

    public synchronized void put(Object obj){
        list.add(obj);
        notify();
    }

    public synchronized Object take(){
        while(list.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                return null;
            }
        }
        Object obj = list.get(0);
        list.remove(obj);
        return obj;
    }
}
