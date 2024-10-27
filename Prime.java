package JAVA1;

import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input value
        System.out.print("Enter the ending number (n): ");
        int n = scanner.nextInt();
        
        System.out.println("Prime numbers between 1 and " + n + ":");
        
        // Loop through the range and print prime numbers
        for (int num = 1; num <= n; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
