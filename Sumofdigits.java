import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int sum=0;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);

    }
}
