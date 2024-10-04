package Encapselation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a bank account
        MiniProject myAccount = new MiniProject("Rohith Kumar", "123456789", 1000000.0);

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        // Bank account operations menu
        while (!exit) {
            System.out.println("\nBank Account Menu");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: $" + myAccount.getBalance());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
