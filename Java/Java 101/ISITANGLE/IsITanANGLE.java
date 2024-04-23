//Raymond Fradella
import java.util.Scanner;
public class IsITanANGLE
{
    public static void main(String[] args)
    {
        ///////////////////////////
        //Variables
        ///////////////////////////
        Scanner input=new Scanner(System.in);
        double degrees;
        
        ///////////////////////////
        //Logic
        //////////////////////////
        System.out.print("What is the angle in degrees: ");
        degrees=input.nextDouble();
        if (degrees==90.0)    {
        System.out.println("The angle is a right angle because it is 90 degrees");
    }
        else
        System.out.println("The angle is not a right angle.");
    
       
        
    }
}
