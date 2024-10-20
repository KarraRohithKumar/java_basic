package Threads;
import Threads.SetPriority;
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
        }
