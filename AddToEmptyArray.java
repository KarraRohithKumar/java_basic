package Arrays;
import java.util.Arrays;

public class AddToEmptyArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution obj = new Solution();
        int[] result = obj.twoSum(nums, 5);

        // Print the result
        if (result != null) {
            System.out.println( Arrays.toString(result));
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // Return the indices
                }
            }
        }
        return null; // Return null if no solution is found
    }
}
