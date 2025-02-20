package Recursion;

public class SumofN_naturalnum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
    static int sum(int n){
        //base case
        if(n==0){
            return 0;
        }
        //recursive
        int result=n+sum(n-1);
        return result;
    }
}
