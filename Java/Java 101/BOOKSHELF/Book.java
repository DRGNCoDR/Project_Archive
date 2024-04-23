
/*
 * Ray Fradella
 * HOLD and Gather all information about a book 
 */
public class Book
{
    /////////////////////////////////
    //Varaibles
    ///////////////////////////////////
      String title,author,publisher,copywright;
  ////////////////////////////////////////////////
  //Constructor
  ///////////////////////////////////////////////
  public Book(String Title,String Author, String Publisher,String Copywright)
{
    title=Title;
    author=Author;
    publisher=Publisher;
    copywright=Copywright;
   
    booktoString();
}

//Organize information and then output it
///////////////////////////////////
//Getters
/////////////////////////////
public String getTitle()
{
    return title;
}
public String getAuthor()
{
    return author;
}
public String getPublisher()
{
    return publisher;
}
public String getCopywright()
{
    return copywright;
}
/////////////////////////////////
//setters
///////////////////////////////////
public String setTitle(String Title)
{
    title=Title;
    return title;
}
public String setAuthor(String Author)
{
    author=Author;
    return author;
}
public String setPublisher(String Publisher)
{
    publisher=Publisher;
    return publisher;
}
public String setCopywright(String Copyright)
{
    copywright=Copyright;
    return copywright;
}

//////////////////////////////////////////
//Organize information and then output it
////////////////////////////////////////////
private void booktoString()
{
    System.out.println("");
    System.out.println("Book Title: "+title+" by "+ author);
    System.out.println("Published by: "+publisher);
    System.out.print("Copyright date: "+copywright);
}
  
}
