package Recursion;

public class Basic {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        // base case
        if(n == 6) {
            return;
        }
        // recursive case
        System.out.print(n + " ");

        print(n + 1);
    }
}
