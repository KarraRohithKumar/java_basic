package String;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Finding the length of the string
        int length = inputString.length();

        // Displaying the length
        System.out.println("The length of the string is: " + length);

        scanner.close();
    }
}

