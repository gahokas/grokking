
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
      
        User user = new SimpleUser();
        user.performAction("action 1");
        System.out.println("----------------");

        user = new UserLoggingDecorator(user);
        user.performAction("action 2");
        System.out.println("----------------");

        user = new UserAPICallDecorator(user);
        user.performAction("action 3");

    }

}
