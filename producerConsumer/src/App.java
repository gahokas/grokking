
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SharedQueue sharedQueue = new SharedQueue();
        new Thread(new Producer(sharedQueue)).start();
        new Thread(new Producer(sharedQueue)).start();
        new Thread(new Producer(sharedQueue)).start();
        new Thread(new Consumer(sharedQueue)).start();
        new Thread(new Consumer(sharedQueue)).start();
        new Thread(new Consumer(sharedQueue)).start();
        new Thread(new Consumer(sharedQueue)).start();
    }

}
