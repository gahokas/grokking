import java.util.Date;

public class Producer implements Runnable {

    private SharedQueue queue;

    public Producer(SharedQueue queue) {
        this.queue = queue;
    }
    
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            String output = new Date().toString();
            queue.put(output);
            log("produced something! Now taking a break");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {}
        }

        log("all done");
    }

    private void log(String message) {
        System.out.println("Producer " + Thread.currentThread().getName() + " " + message);
    }
    
}
