public abstract class UserDecorator implements User {

    private final User userToBeDecorated;

    public UserDecorator(User userToBeDecorated) {
        this.userToBeDecorated = userToBeDecorated;
    }

    @Override
    public void performAction(String actionName) {
        userToBeDecorated.performAction(actionName);
    }

}
