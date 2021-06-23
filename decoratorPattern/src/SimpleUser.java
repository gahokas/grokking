public class SimpleUser implements User {

    @Override
    public void performAction(String actionName) {
        System.out.println("SimpleUser performing action " + actionName);        
    }
    
}