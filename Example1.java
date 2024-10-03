package Abstraction;

/**
 * InnerExample1
 */
 interface InnerExample1 {
    public void  church();
    public void church1(); 
    }
class InnerExample12 implements InnerExample1{
    public void church(){
        System.out.println("no");
    }
    public void church1(){
   System.out.println("yes");
    }
    // @Override
    // public void church1() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'church1'");
    // }
   

}
    
public class Example1 {
    public static void main(String[] args) {
        InnerExample12 obj=new InnerExample12();
        obj.church();
        obj.church1();
    }
}
