package Recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr={1,3,2,5,2,6};
        int target=2;
        System.out.println(check(arr,0,target));
    }
    static int check(int[] arr,int ind,int target){

    //base case
if(ind==arr.length){
    return -1;
}

    //recursive case
if(arr[ind]==target){
    return ind;
}
return check(arr, ind+1, target);
 }
}
