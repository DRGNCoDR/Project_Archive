//Raymond Fradella
import java.util.Scanner;
public class OddorEven
{
    public static void main(String[] args)
    { 
        //////////////////////////////
        //Variables
        //////////////////////////////
        Scanner input=new Scanner(System.in);
        int number;
        
        /////////////////////////////
        //Gather input
        ////////////////////////////
        System.out.print("Enter a number ");
        number=input.nextInt();
        
        ///////////////////////////
        //Odd or Even
        //////////////////////////
        if (number%2==0)
        {
            System.out.print("The number is even.");
        }
        else
            System.out.print("The number is odd");
        
    }
}
