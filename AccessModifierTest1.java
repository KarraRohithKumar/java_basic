// FirstClass.java
class FirstClass {
    public String publicVar = "Public Variable in FirstClass";
    private String privateVar = "Private Variable in FirstClass";
    protected String protectedVar = "Protected Variable in FirstClass";
    String defaultVar = "Default Variable in FirstClass"; // Default access

    public void displayValues() {
        System.out.println("Inside FirstClass:");
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

// SecondClass.java
class SecondClass {
    public void displayValues() {
        FirstClass first = new FirstClass();
        
        System.out.println("Inside SecondClass:");
        System.out.println("Public: " + first.publicVar);
        // first.privateVar is not accessible here due to private access
        System.out.println("Protected: " + first.protectedVar); // Accessible within the same package
        System.out.println("Default: " + first.defaultVar); // Accessible within the same package
    }
}

// AccessModifierTest.java
public class AccessModifierTest1 {
    public static void main(String[] args) {
        FirstClass first = new FirstClass();
        SecondClass second = new SecondClass();
        
        first.displayValues();
        System.out.println();
        second.displayValues();

        System.out.println("\nDirect Access in Main:");
        System.out.println("Public: " + first.publicVar);
        // System.out.println(first.privateVar); // Not accessible due to private access
        System.out.println("Protected: " + first.protectedVar); // Accessible within the same package
        System.out.println("Default: " + first.defaultVar); // Accessible within the same package
    }
}
