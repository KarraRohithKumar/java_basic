
    // ModifierExample.java
class ModifierExample {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40; // Default access

    public void showValues() {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
    }
}

public class AccessModifierTest {
    public static void main(String[] args) {
        ModifierExample obj = new ModifierExample();
        obj.showValues();

        System.out.println("Direct Access to Public Variable: " + obj.publicVar);
        // obj.privateVar is not accessible here due to private modifier
        System.out.println("Direct Access to Protected Variable: " + obj.protectedVar);
        System.out.println("Direct Access to Default Variable: " + obj.defaultVar);
    }
}

