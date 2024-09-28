package Threads;

public class Thread2 {
        public static void main(String[] args) {

            Thread1 obj=new Thread1();
            Thread thread = new Thread(obj);
            thread.start();
            for (int index = 0; index <=5; index++) {
    System.out.println("main");            
            }
        }
        
    }
    
    
