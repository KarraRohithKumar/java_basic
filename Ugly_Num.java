public class Ugly_Num {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false; // Ugly numbers must be positive
        }
        
        // Divide n by 2, 3, and 5 as long as it is divisible
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        
        // If n is reduced to 1, it is an ugly number
        return n == 1;
    }

    public static void main(String[] args) {
        int n1 = 6;
        System.out.println(isUgly(n1)); // Output: true

        int n2 = 14;
        System.out.println(isUgly(n2)); // Output: false

        int n3 = 1;
        System.out.println(isUgly(n3)); // Output: true
    }
}
