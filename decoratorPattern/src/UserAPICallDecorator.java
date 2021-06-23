public class UserAPICallDecorator extends UserDecorator {

    public UserAPICallDecorator(User userToBeDecorated) {
        super(userToBeDecorated);
    }

    @Override
    public void performAction(String actionName) {
        super.performAction(actionName);
        callSomeAPI();
    }

    private void callSomeAPI() {
        System.out.println("UserAPICallDecorator is doing something");
    }
    
}
