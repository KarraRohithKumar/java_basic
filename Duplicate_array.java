package Arrays;

class Duplicate_array{
    public boolean hasDuplicate(int[] nums) {

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }}
                 return false;
                }
            
//public class Duplicate_array{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,};
        Duplicate_array obj=new Duplicate_array();
        System.out.println(obj.hasDuplicate(nums));
    }
}
        
 
    
