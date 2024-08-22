import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        int marks;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("give marks");
        marks=sc.nextInt();
     
        if(marks>=90)
            System.out.println("a grade");
        
        else if  (marks>=80)
            System.out.println("b grade");
        
        else
            System.out.println(" fail");
    
    
}
}
