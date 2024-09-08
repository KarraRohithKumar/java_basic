package Arrays;

/**
 * linearsearch
 */
public class linearsearch {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int target=2;
        for( int i=0;i<a.length;i++){
            if (a[i]==target){
                System.out.println(i+" element is founded");
                break;
            }

        }
    }
}