package String;

import java.util.Scanner;

public class Creat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Create a StringBuffer object with the original string
        StringBuffer str1 = new StringBuffer(str);
        
        // Reverse the string using reverse() method of StringBuffer
        String reversed = str1.reverse().toString();
        
        // Check if the original string is equal to the reversed string
        if (str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
}
