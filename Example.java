package Abstraction;

abstract class Animal {
    public abstract void temple();

    public void temple1(String n) {
        System.out.println("yes");
    }
}
class Light extends Animal{
public void temple(){
    System.out.println("no");
}
}

public class Example {
    public static void main(String[] args) {
Light obj=new Light();
obj.temple();
obj.temple1("uh");
    }
}
