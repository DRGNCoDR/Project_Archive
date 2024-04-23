//Raymond Fradella
import java.util.Scanner;

public class DigitSwitch
{
   public static void main(String[] args)
   {
       ////////////////////////////////////
       //Variables
       ////////////////////////////////////
       Scanner imput=new Scanner(System.in);
       
       int digit;
       
       /////////////////////////////////////
       //Gather Input
       /////////////////////////////////////
       System.out.print("Enter a single digit number ");
       digit=imput.nextInt();
       
       switch(digit)    //Check if number is even or odd without % or /
       {
           default: System.out.print("Invalid Number!");break;
           case 0: System.out.print("Even");break;
           case 2: System.out.print("Even");break;
           case 4: System.out.print("Even");break;
           case 6: System.out.print("Even");break;
           case 8: System.out.print("Even");break;
           case 1: System.out.print("Odd");break;
           case 3: System.out.print("Odd");break;
           case 5: System.out.print("Odd");break;
           case 7: System.out.print("Odd");break;
           case 9: System.out.print("Odd");break;
           
        }
    }
}
