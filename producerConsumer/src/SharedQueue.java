import java.util.Date;
import java.util.LinkedList;

public class SharedQueue {

    private final int WAIT_TIME = 10000;
    private LinkedList<String> queue;

    public SharedQueue() {
        queue = new LinkedList<>();
    }

    public synchronized void put(String string) {
        queue.addLast(string);
        notify();
    }

    public synchronized String get() {
        int totalWaitTime = 0;
        while (queue.isEmpty() && totalWaitTime < WAIT_TIME) {
            try {
                long waitStartTime = new Date().getTime();
                long timeToWait = WAIT_TIME - totalWaitTime;
                wait(timeToWait);
                totalWaitTime += (new Date().getTime() - waitStartTime);
            }
            catch (InterruptedException e) {
            }
        }

        if (!queue.isEmpty()) {
            return queue.removeFirst();
        }
        
        return null;
    }
 
}
