package Arrays;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums={1,2,3,2,3};
        Solution obj=new Solution();
        System.out.println(obj.singleNumber(nums));
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i++; j < nums.length-1; j++) {
                if(nums[i]!=nums[j]){
                    return i;
                }
            }
         
        }return 0;
    }
}