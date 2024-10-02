package Inheritance;

// Parent class
class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // Overriding the sound method in the Dog class
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Animal object
        Animal myAnimal = new Animal();
        myAnimal.sound();  // Calls the method in Animal class

        // Creating a Dog object
        Dog myDog = new Dog();
        myDog.sound();  // Calls the overridden method in Dog class
    }
}
