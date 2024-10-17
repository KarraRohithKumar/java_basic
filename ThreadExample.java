package Threads;
/* 
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
}*/
class Thread1 extends Thread 
{ 
 public void run() 
 { 
  for(int i=1;i<=5;i++) 
  { 
   System.out.println("Inside run"+i); 
  } 
 } 
} 
public class ThreadExample
{ 
 public static void main(String[] args) 
 { 
  Thread1 obj =new Thread1(); 
  obj.start(); 
  for(int j=0;j<=5;j++) 
  { 
   System.out.println("Inside Main"+j);}}}


