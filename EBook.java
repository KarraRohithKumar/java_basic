package Inherit;
import Inheritance.*;
//child class
public class  EBook extends Book {
    private Double Filesize;
    //constructor to initialize the details
    public EBook( String BookName, String BookAuthor,Double ISBN,Double Filesize){
super(BookName, BookAuthor, ISBN);
this.Filesize=Filesize;
    
}
public void displaybookdetails(){
    super.displaybookdetails();//calling the parent class to display parent class details
System.out.println("Filesize :"+Filesize+" MB" );
}
}
