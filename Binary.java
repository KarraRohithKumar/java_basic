
/*public class Binary {
       static void  MYfun(int a){
String c=" ";
while(a>0){
    int k=a%2;
    c=k+c;
    a=a/2;
    System.out.println(c);
    }
       }
    
        
import java.util.Scanner;
public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("give any number:");
    int a=sc.nextInt();
    MYfun(a);

    }*/
    import java.util.Scanner;

    public class Binary {
        static void MYfun(int a) {
            String c = "";
            while (a > 0) {
                int k = a % 2;
                c = k + c;
                a = a / 2;
            }
            System.out.println("Binary representation: " + c);
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Give any number:");
            int a = sc.nextInt();
            MYfun(a);
        }
    }
    