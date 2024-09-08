package Arrays;

public class largeinArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,777,8,9,0};
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int curr=a[i];
           //IN BUILT
            maxi=Math.max(maxi,curr);
            /*if(curr>maxi){
                maxi=curr;*/
        }System.out.println(maxi);
    }
    
}
