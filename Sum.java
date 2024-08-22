import java.util.Scanner;
/*sum of two num's */
public class Sum {
    public static void main(String[]args){
        int a,b,c;
        @SuppressWarnings("resource")
        Scanner in= new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
        System.out.println(c);
}
}