public class Consumer implements Runnable {

    private SharedQueue queue;

    public Consumer(SharedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            String output = queue.get();
            log("received " + output);
            if (output == null) {
                break;
            }
        }

        log("timed out waiting for producer.. I guess we're done");
    }

    private void log(String message) {
        System.out.println("Consumer " + Thread.currentThread().getName() + " " + message);
    }
    
}
