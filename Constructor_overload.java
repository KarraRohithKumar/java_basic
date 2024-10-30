package JAVA1;
class Student {
    String name;
    int age;

    // Constructor with no parameters
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor: Name = " + name + ", Age = " + age);
    }

    // Constructor with parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor: Name = " + name + ", Age = " + age);
    }
}

public class Constructor_overload {
    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();

        // Using parameterized constructor
        Student student2 = new Student("Alice", 20);
    }
}

