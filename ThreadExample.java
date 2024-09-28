package Threads;

public class ThreadExample {
    public static void main(String[] args) {
        // Create an object of Thread1
        Thread1 obj = new Thread1();

        // Start the thread using start(), not run()
        obj.start();

        // Main thread execution
        for (int index = 0; index < 5; index++) {
            System.out.println("Main thread");
        }
    }
}


