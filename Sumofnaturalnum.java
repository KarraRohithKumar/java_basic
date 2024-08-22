import java.util.Scanner;
public class Sumofnaturalnum {
        public static void main (String[]args){
        int i,n;
        int sum=0;
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            sum=sum+i;

    }
    System.out.println("sum of natural number is "+sum);
    
}
}
