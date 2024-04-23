
/**
 * Print a username including First name initial, first five characters 
 * of last name and 2 numbers randomly generated.
 * @author (Ray Fradella) 
 
 */

import java.util.Scanner;
import java.util.Random;

public class UserNameGenerator
{
    public static void main(String[] args)
    {
   //////////////////////
   //Variables
   //////////////////////
    String firstName,lastName;
    Random rand=new Random();
    int userNumber;
    Scanner input=new Scanner(System.in);
    
   /////////////////////////////
   //Gather input
   /////////////////////////////    
    System.out.print("Enter first name: ");
    firstName=input.next();
    
    System.out.print("Enter last name: ");
    lastName=input.next();
    
    userNumber=rand.nextInt(89)+10;
  
    //////////////////////////////
   //Print Username
   //////////////////////////////
    System.out.print("Username: "+firstName.charAt(0)+lastName.substring(0,5)+userNumber);
    
}
}
