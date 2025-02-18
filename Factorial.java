package Recursion;

public class Factorial {
    public static void main(String[] arg) {
       int n=6;
       System.out.println(factorial(n));
    }
    static int factorial(int n){
        //Base case
        if(n==1 || n==0){
            return 1;
        }
        //Recursive case
         int result=n*factorial(n-1);
        return result;
    }
}
   // int n = 3;
        // int fact = 1;
        // for (int i = 1; i <= n; i++) {
        //     fact = fact * i;

        // }
        // System.out.println(fact);