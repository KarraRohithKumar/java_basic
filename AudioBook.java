package Inherit1;
import Inherit.*;
public class AudioBook extends EBook {
    private Double Duration;
    public AudioBook( String BookName, String BookAuthor,Double ISBN,Double Filesize,Double Duration){
        super(BookName, BookAuthor, ISBN, Filesize);
        this.Duration=Duration;
    }
    public void displaybookdetails(){
        super.displaybookdetails();
        System.out.println("Book duration :"+Duration+"hrs");

    }
    
}