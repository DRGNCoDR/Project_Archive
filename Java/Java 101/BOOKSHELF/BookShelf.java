
/*
 * Ray Fradella
 * Gather information about a book
 */
import java.util.Scanner;
public class BookShelf
{
   public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       
       //////////////////////////////////////////
       //variables
       /////////////////////////////////////////
       String title,author,publisher,copyright;
     
       /////////////////////////////////////////
       //gather the information
       ///////////////////////////////////////////
       System.out.print("What is the title of the book? ");
       title=input.next();
       
       System.out.print("What is the author's first name of the book? ");
       author=input.next();
       
       System.out.print("What is the publisher of the book? ");
       publisher=input.next();
       
       System.out.print("What is the copyright of the book? ");
       copyright=input.next();
      
       ////////////////////////////////////////////////////////////
       //Call to the book class to show information.
       ////////////////////////////////////////////////////////////
       Book book=new Book(title,author,publisher,copyright);
       
    }
}
