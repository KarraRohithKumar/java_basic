package Recursion;

public class N_to_one_dicreasingorder {
    public static void main(String[] args) {
        int n = 10;
        // for (int i = n; i>0; i--) {
        // System.out.print(i+" ");
        // }
        get(n);
    }

    static void get(int n) {
        if (n == 0) {
            return;
        }
        get(n -1);
        System.out.print(n + " ");
        // get(n -1);
    }
}
