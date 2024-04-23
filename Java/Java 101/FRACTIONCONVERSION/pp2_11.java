
import java.util.Scanner; // import the scanner

public class pp2_11
{
    public static void main(String[] args)
   {
       /////////////////////////
       //VARIABLES
       /////////////////////////
       int numerator ,denominator;
       double fraction;
       Scanner input=new Scanner(System.in);
       
       /////////////////////////
       //GATHER INPUT
       /////////////////////////
       System.out.println("Enter the numerator:");
       numerator=input.nextInt();
       System.out.println("Enter the denominator:");
       denominator=input.nextInt();
       
       /////////////////////////
       //RESULT OF FRACTION CONVERSION
       /////////////////////////
       System.out.print("The decimal value of the fraction ");
      
         //PRINT THE FRACTION//
         System.out.print(numerator); System.out.print("/"); System.out.println(denominator); 
          
         System.out.println((double)numerator/denominator);
       
   }
}
