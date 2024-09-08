package Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int k=6;
        int b=search(a, k);
        System.out.println(b);
    }
    static int search(int[] a,int k){
        int mid,low,high;
        low=0;
        high=a.length;


        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==k){
                return mid;
            }else if(a[mid]<k){
                low=mid+1;
            }else if(a[mid]>k){
                high=mid-1;
            }
            }
            
            return -1;
        }}
