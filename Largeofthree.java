import java.util.Scanner;
public class Largeofthree {
    public static void main(String[] args) {
      @SuppressWarnings("resource")
    /*Scanner sc=new Scanner(System.in);
      System.out.println("give the value of a");
      int a=sc.nextInt();
      System.out.println("give the value of b");
      int b=sc.nextInt();
      System.out.println("give the value of c");
      int c=sc.nextInt();*/
      int a=12;
      int b=32;
      int c=56;
String largest = " ";
        largest=(a>b && a>c)?"a":(b>a && b>c)?"b":(c>a && c>b)?"c":"all are equal";
        System.out.println("largest number is " + largest);
    }
}


