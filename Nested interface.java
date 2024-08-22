
    



// Outer class
public class OuterClass {
    
    // Nested interface
    public interface NestedInterface {
        void display();
    }
    
    // Inner class implementing the nested interface
    public static class InnerClass implements NestedInterface {
        @Override
        public void display() {
            System.out.println("Hello from the nested interface implementation!");
        }
    }
    
    public static void main(String[] args) {
        // Create an instance of the inner class
        NestedInterface obj = new InnerClass();
        
        // Call the method from the nested interface
        obj.display();
    }
}
