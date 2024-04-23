//Add two cubed numbers
import java.util.Scanner;
public class SumOfCubes
{
    public static void main(String[] args)
    {
        ///////////////////
        //Variables
        ///////////////////
       int number1,number2;
       Scanner input=new Scanner(System.in);
       
       /////////////////////
       //Gather Numbers
       /////////////////////
       System.out.print("Enter the first number to cube: ");
       number1=input.nextInt();
       System.out.print("Enter the second number to cube: ");
       number2=input.nextInt();
       
       ////////////////////
       //Result
       ////////////////////
       System.out.print(Math.pow(number1,3)+Math.pow(number2,3));
    }

}
