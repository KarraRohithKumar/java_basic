public class Patterns {
    public static void main(String[]args){
        int n=5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i-2;j++){
                System.out.print(" ");}
                for(int k=0;k<=n-i;k++){
                    System.out.print("*");
            }
            for(int k=0;k<=n-i;k++){
                System.out.print("*");}
            System.out.println("");
           }
       /*  char ch=65;
        for(int i=1;i<=n;i++){
       ch=65;
    for(int j=1;j<=i;j++){
        System.out.print(ch+" ");
        ch++;}
      System.out.println(" ");}*/

}}
