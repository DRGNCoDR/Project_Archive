
/**
 * Write a description of class Kennel_7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


//Keep track of the dogs in a kennel
 
// * @Ray Fradella

 import java.util.Scanner;// Scanner
public class Kennel_7
{
public static void main(String[] args)
{
    Scanner input= new Scanner(System.in);
      Dog_7[] dog=new Dog_7[3];
    
       int avg=0;
    for(int i=0;i<3;i++)
    {
      System.out.print("What is the dog's name? ");
      String name=input.next();
    
      System.out.print("What is the dog's age? ");
      int age=input.nextInt();

      dog[i]=new Dog_7(name,age);
      avg+=dog[i];
    }     
      
      avg=(double)avg/dogs.length;
      
   
}
    
   
}
