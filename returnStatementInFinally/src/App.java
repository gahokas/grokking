
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String result = calculate();
        System.out.println("Result: " + result);      
    }

    public static String calculate() {
        try {
            System.out.println("Calculating...");
            int result = 1 + 2 + 3;
            return "Answer: " + result;            
        }
        finally {
            System.out.println("In finally");
            return "Return from finally";
        }
        
    }
}
