import java.util.Scanner;

public class Multiplytable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
       for(int i=1;i<=10;i++){
            //for(int j=1;j<=2;j++){
            System.out.println(i+" * " + n+  " = "  + n*i);
        
}
    }

}