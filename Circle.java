import java.util.Scanner;
public class Circle {
    public static void main(String[]args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("give the radius");
        int r=sc.nextInt();
        double area=3.14*r*r;
        System.out.println("area of the cicle is " + area);
        }
}

