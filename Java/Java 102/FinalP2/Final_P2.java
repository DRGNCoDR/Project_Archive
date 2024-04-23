import java.util.Scanner;
public class Final_P2
{

    public static int getNumber()
    {
       System.out.print("Enter a number");
         
       Scanner scn=new Scanner(System.in);
       int a = scn.nextInt();
       
       int total = 0;
       total += a % 10;
       
       System.out.print("Your Result: ");
       System.out.print(total);
       
       if (a == 0)
       {
           return total;
       }
       else
       {
           return getNumber();
       }
        
    }
}
