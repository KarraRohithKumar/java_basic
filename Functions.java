/*import java.util.Scanner;
public class Functions {
    public static int sumname(int a,int b){
        //int sum=a+b;
        return a*b;
    }
    /*public static void MyName(String name){
    System.out.println(name);
    return;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("product of given numbers : "+sumname(a,b));
        

    }
    
}*/
//to find factorial
/*import java.util.Scanner;

public class Functions{
    public static void factorial(int n){
        int a=1;
        if (n<0){
            System.out.println("no factorial for given number");
            return;
        }
        for(int i=n;i>=1;i--){
            a=a*i;
        }
        System.out.println("factorial "+a);
        return ;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
    }
}*/
//to find even number
/*import java.util.Scanner;

public class Functions{
    public static void Even(int n){
          if (n%2==0){
            System.out.println(n+" it is even");
            }
        
        else{
            System.out.println(n+" not an even");
        }
        return;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Prime(n);
    }  
}*/
/*import java.util.Scanner;
public class Functions{
    public static void Prime(int n){
        int count=0;
        int i=1;
        while(i<=n){
           if (n%i==0 ){
            count++;
          }
        i++;
        }
        if(count==2){
            System.out.println(n+" IT IS PRIME");
        }
        else{
            System.out.println(n+" IT IS  not PRIME");
        }
        return;
    }
public static void main(String[]args){
            @SuppressWarnings("resource")
            Scanner sc=new Scanner(System.in);
            System.out.println("give any number:");
            int n=sc.nextInt();
            Prime(n);
        }
    }*/
/*import java.util.Scanner;
public class Functions{
        public static void Prime(int n){
            int count=0;
            int l=1;
            if (l<=n){
            for(int i=1;i<=l;i++){
                if (n%i==0){
                count++;
                l++;
            }}}
            if (count==2){
                System.out.println(n+" IT IS PRIME");
            }
            else{
                System.out.println(n+" IT IS  not PRIME");
            }
            return;
        }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("give any number:");
    int n=sc.nextInt();
    Prime(n);
}}*/
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the value of n
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Print prime numbers from 1 to n
        System.out.println("Prime numbers from 1 to " + n + ":");

        // Iterate through numbers from 2 to n
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            // Check if num is a prime number
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If isPrime is still true, num is a prime number
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
           