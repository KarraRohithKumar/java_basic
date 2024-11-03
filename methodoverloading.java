/*public class methodoverloading {
    public  int add(int a,int b) {
        return a+b;}
    public  int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[]args){
      int a=1;
      int b=2;
      int c=3;
      methodoverloading obj=new methodoverloading();

      System.out.println(obj.add(a,b));
    
        
    }
    
}*/

/*import java.util.Scanner;

public class methodoverloading {
    public  int add(int a,int b) {
        return a+b;}
    public  double add(double a,double b){
        return a+b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("give a value ");
        double a=sc.nextDouble();
        System.out.print("give b value ");
        double b=sc.nextDouble();
      methodoverloading obj=new methodoverloading();

      System.out.println(obj.add(a,b));
    
        
    }
    
}*/

/*import java.util.Scanner;
\\\\LARGE OF THREE\\\\
class methodoverloading{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a value ");
        int a=in.nextInt();
        System.out.print("enter b value ");
        int b=in.nextInt();
        System.out.print("enter c value ");
        int c=in.nextInt();
        System.out.println(max(a,b,c));
        System.out.println(min(a,b,c));
}
static String max(int a,int b,int c){
   
   return (a>=b && a>=c)?("a is max"):(b>=a && b>=c)?("b is max"):(c>=b && c>=2a)?("c is max"):("all are equal");
}
static String min(int a,int b,int c){
   
    return (a<=b && a<=c)?("a is min"):(b<=a && b<=c)?("b is min"):(c<=b && c<=a)?("c is min"):("all are equal");
 }}
    \\\\CHECKING VOTE\\\\\
 import java.util.Scanner;
 public class methodoverloading{
    public static void Even(int age){
          if (age>18){
            System.out.println("eligible for vote");
            }
        
        else{
            System.out.println("not eligible");
        }
    }
    public static void main(String[]args){
        Scanner hgj=new Scanner(System.in);
        System.out.print("enter your age ");
        int age=hgj.nextInt();
        Even(age);
    }  }*/
      //AREA AND CICUMFERENCE//
import java.util.Scanner;
      class methodoverloading{
    public static void main(String[] args) {
    
    Scanner in=new Scanner(System.in);
    System.out.print("enter the radius ");
    Double r=in.nextDouble();
    in.close();
    circle(r);
    return;
    }
    static void circle(Double r){
        Double area=3.14*r*r;
        Double circum=2*3.14*r;
System.out.println("area is "+area);
System.out.println("circumference is "+circum);
    }
      }
/*\\\\\MARKS\\\\\\
import java.util.Scanner;
class methodoverloading{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a value ");
        int a=in.nextInt();
        System.out.println(max(a));
       
}
static String max(int a){
   
   return (100>=a&& a>=91)?("AA"):(a>=81)?("AB"):(a>=71)?("BB"):(a>=61)?("BC"):(a>=51)?("CD"):(a>=41)?("DD"):(a<=40)?("FAIL"):("");
}}*/



//\\\\Sumofnaturalnum\\\\
/*import java.util.Scanner;
class methodoverloading{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        sumo(n);
    }
    static void sumo(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
    sum=sum+i;
}
System.out.println("sum of natural number is "+sum);
}}*/

