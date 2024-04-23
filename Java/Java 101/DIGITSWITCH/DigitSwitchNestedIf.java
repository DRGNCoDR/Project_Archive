 //Raymond Fradella
import java.util.Scanner;

public class DigitSwitchNestedIf
{

   public static void main(String[] args)
   {
       /////////////////////////////////
       //Variables
       /////////////////////////////////
       Scanner imput=new Scanner(System.in);
       
       int digit;
       
       /////////////////////////////////
       //Gather input
       /////////////////////////////////
       System.out.print("Enter a single digit number between 0 and 10 ");
       digit=imput.nextInt();
       //Nested if
       if(digit<=10)
       {
           if(digit>0)
           {
               switch(digit)
               {
                   default: System.out.print("Invalid Number!");break;
                   case 0: System.out.print("Even");break;
                   case 2: System.out.print("Even");break;
                   case 4:  System.out.print("Even");break;
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
}
}



