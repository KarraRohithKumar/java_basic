package Threads;
class UnderAgeException extends Exception 
{ 
 UnderAgeException() 
 { 
  super("You are under age"); 
 } 
} 
public class Voting {
 public static void main(String[] args) 
 { 
     int age=17; 
                           try 
          { 
  if(age<18) 
      { 
         throw new UnderAgeException(); 
      } 
  else 
      { 
    System.out.println("You can vote"); 
      } 
        } 
        catch(UnderAgeException e) 
         { 
  e.printStackTrace(); 
         } 
             System.out.println("this is outside try catch");
        }}