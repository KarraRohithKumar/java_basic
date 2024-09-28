package Threads;

// Create a class that extends Thread
class Thread1 extends java.lang.Thread {
    public void run() {
        // Override the run method
        for (int index = 0; index < 5; index++) {
            System.out.println("Thread1 is running");
        }
    }
}

// public class ThreadExample {
//     public static void main(String[] args) {
//         // Create an object of Thread1
//         Thread1 obj = new Thread1();

//         // Start the thread using start(), not run()
//         obj.start();

//         // Main thread execution
//         for (int index = 0; index < 5; index++) {
//             System.out.println("Main thread");
//         }
//     }
// }





// package Threads;

// public class Thread1 implements Runnable{
//     public void run(){
//         for(int i=0;i<=5;i++){
//             System.out.println("run");
//         }
//     }
  
    
// }
