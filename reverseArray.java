package Arrays;

public class reverseArray {
    public static void main(String[] args) {
        /*int[] arr={1,2,3,4,5};
        int a=10;
        int b=20;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);*/
                // Example array
                int[] arr = {1, 2, 3, 7,7,4, 5};
        
                System.out.println("Original array:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
        
                System.out.println("\nReversed array:");
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }}}
