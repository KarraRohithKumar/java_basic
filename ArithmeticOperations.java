package JAVA1;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two operands as input
        System.out.print("Enter first operand: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter second operand: ");
        double operand2 = scanner.nextDouble();

        // Displaying choices
        System.out.println("Choose an arithmetic operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Taking user choice
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Performing operation based on user choice
        switch (choice) {
            case 1:
                System.out.println("Result: " + (operand1 + operand2));
                break;
            case 2:
                System.out.println("Result: " + (operand1 - operand2));
                break;
            case 3:
                System.out.println("Result: " + (operand1 * operand2));
                break;
            case 4:
                if (operand2 != 0) {
                    System.out.println("Result: " + (operand1 / operand2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please choose between 1 and 4.");
        }

        scanner.close();
    }
}
