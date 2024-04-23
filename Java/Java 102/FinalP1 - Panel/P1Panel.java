import java.util.Scanner;

public class P1Panel
{
    public void drawPanel()
    {
        try  
        {
            Scanner input=new Scanner(System.in);
  
            System.out.print("Enter A: ");
            int a = input.nextInt();
  
            System.out.println("Enter B: ");
            int b = input.nextInt();
  
            if (a == b)
            {
                System.out.print("a = b");
            }

            if (a > b)
            {
                System.out.print("a > b");
            }

            if (a < b)
            {
                System.out.print("a < b");
            }
        }
        catch ( NumberFormatException nfe ) 
        {
            System.out.println("Not a number");
        }
    }
}
