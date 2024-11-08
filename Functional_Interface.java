package JAVA1;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class Functional_Interface {
    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        Greeting greeting = name -> System.out.println("Hello, " + name + "!");

        // Calling the method
        greeting.sayHello("Rohith");
    }
}
