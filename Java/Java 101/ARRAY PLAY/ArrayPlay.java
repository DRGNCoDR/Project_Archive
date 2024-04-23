
//Ray Fradella
import java.util.Scanner;
import java.util.Random;
public class ArrayPlay
{
   public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int userNumber=0;
      ////////////////////////////////////
       //Array with 10 variables
       /////////////////////////////////
      int[] anArrayRandomInt;
      anArrayRandomInt=new int[10];
      
      //////////////////////////////////////////////////////////////////////////
      //For loop that assigns a random number between 0 and 6 
      /////////////////////////////////////////////////////////////////////////
      for(int i=0;i<10;i++)
      {
      anArrayRandomInt[i]=getRandomNumber(); //Call to function to get and assign a random number
      }
      
    
    
     
      //////////////////////////////////////////
      //For Loop that prints out location value
      //////////////////////////////////////////
      for(int i=0;i<10;i++)
      {
         //Gather number
          System.out.print("Enter a number between 0 and 6:    ");
      userNumber=input.nextInt();
        //make sure number is in range
          if (userNumber<=6)
          {
          System.out.println("Number is in location ["+userNumber+"]");break; //Print    
          }
          else
          {
              System.out.println("That number is not within the range of numbers allowed.");
            }
            
   }
   
   //////////////////////////////////////////////////
   //For Loop that prints subscript and the value
   ////////////////////////////////////////////////////
   for(int i=0;i<10;i++)
   {
       System.out.println("Number ["+userNumber+"]: "+anArrayRandomInt[i]);break; //Print
       
    }
 
}
   public static int getRandomNumber()
   {
       //Declare
       Random randInt=new Random();
       //Initialize
       int randomNumber=randInt.nextInt(6);
       return randomNumber;
   }
}
