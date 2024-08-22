import java.util.Scanner;

public class Ternary {
    public static void main(String[]args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner (System.in);
        System.out.println("give marks");
        int marks =sc.nextInt();
        String result=(marks>=100)?("you gives wrong marks"):(marks>=90)?("a grade"):(marks>=80)?("b grade"):("fail");
        System.out.println(result);

    }
    
}
