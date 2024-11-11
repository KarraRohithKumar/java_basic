import java.util.Scanner;

public class OddPrimeNumbers {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to find and print odd prime numbers up to n
    public static void findOddPrimes(int n) {
        System.out.print("Odd prime numbers from 1 to " + n + " are: ");
        for (int i = 3; i <= n; i += 2) { // Start from 3 and increment by 2 to skip even numbers
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Find and print odd prime numbers up to n
        findOddPrimes(n);
        
        scanner.close();
    }
}
