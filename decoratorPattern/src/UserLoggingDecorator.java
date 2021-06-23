public class UserLoggingDecorator extends UserDecorator {

    public UserLoggingDecorator(User userToBeDecorated) {
        super(userToBeDecorated);
    }

    @Override
    public void performAction(String actionName) {
        super.performAction(actionName);
        logSomeStuff();
    }

    private void logSomeStuff() {
        System.out.println("UserLoggingDecorator is doing something");
    }
    
}
