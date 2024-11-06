package Threads;
/*import SetPriority.*;
public class Main12 {
    public static void main(String[]args){
        Thread.currentThread().setPriority(10);
        SetPriority obj=new SetPriority();
        obj.setPriority(1);
        obj.start();
        for (int j=0;j<=3;j++){
            System.out.println("inside main"+j);
                }
            }
        }*/
// First thread displays "Good Morning" continuously (without delay)
/*class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            // No sleep, so no try-catch needed
        }
    }
}

// Second thread displays "Hello" continuously (without delay)
class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            // No sleep, so no try-catch needed
        }
    }
}

// Third thread displays "Welcome" continuously (without delay)
class WelcomeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            // No sleep, so no try-catch needed
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        GoodMorningThread t1 = new GoodMorningThread();
        HelloThread t2 = new HelloThread();
        WelcomeThread t3 = new WelcomeThread();

        t1.start();
        t2.start();
        t3.start();
    }
}*/

// First thread displays "Good Morning" every 1 second
class GoodMorningThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning");
                Thread.sleep(1000);  // 1000ms = 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Second thread displays "Hello" every 2 seconds
class HelloThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Hello");
                Thread.sleep(2000);  // 2000ms = 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Third thread displays "Welcome" every 3 seconds
class WelcomeThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Welcome");
                Thread.sleep(3000);  // 3000ms = 3 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class MultiThreadExample {
    public static void main(String[] args) {
        // Creating instances of each thread
        GoodMorningThread t1 = new GoodMorningThread();
        HelloThread t2 = new HelloThread();
        WelcomeThread t3 = new WelcomeThread();

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
