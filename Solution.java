package Arrays;

import java.util.Scanner;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];//0
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take input for n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Initialize the array of size 2*n
        int[] nums = new int[2 * n];
sc.close();
        // Take input for the array elements
        System.out.println("Enter " + (2 * n) + " elements of the array:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create an object of the Solution class and call the shuffle method
        Solution solution = new Solution();
        int[] result = solution.shuffle(nums, n);

        // Print the result array
        System.out.println("Shuffled array:");
        System.out.print( "[");
        for (int num : result) {
            System.out.print(+num + " ");
        }
        System.out.print( "]");
    }
}
