package Arrays;


    import java.util.Arrays;

public class Permutation{
    public static void main(String[] args) {
        // Example input: a zero-based permutation array
        int[] nums = {0, 2, 1, 5, 3, 4};

        // Call the buildArray method to get the result
        int[] ans = buildArray(nums);

        // Print the result
        System.out.println(Arrays.toString(ans));  // Output: [0, 1, 2, 4, 5, 3]
    }

    // Method to build the array according to the problem statement
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
