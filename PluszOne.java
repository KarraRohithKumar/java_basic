package Arrays;
import java.util.Arrays;
public class PluszOne {
    public static void main(String[] args) {
        int[] digits={1,2,3};
        int[] n=new int[3];
        Solution obj=new Solution();
        obj.plusOne(digits);
        System.out.println(Arrays.toString(digits));
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
           int sum = digits[i]+digits[i+1];
           digits[digits.length]=sum;
        }
        return digits;
    }
}