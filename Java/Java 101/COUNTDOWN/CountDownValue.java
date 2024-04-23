
//Ray Fradella
import java.util.Scanner;
import java.lang.*;

public class CountDownValue
{
    public static void main(String[] args)
    {
        
    ////////////////////////////////
    //VARIABLES
    ////////////////////////////////
    Scanner input=new Scanner(System.in);
    
    int startNumber;
    
    System.out.println("Enter a number to start the coundown at ");
    System.out.print("Blast off in: ");
    
    //////////////////////////////////////
    //GATHER INPUT
    //////////////////////////////////////
    
    startNumber=input.nextInt();
    int i =startNumber;             //set for variable number without updating
    /////////////////////////////////////////
    //DISPLAY COUNTDOWN
    /////////////////////////////////////////
    
   for( i=i ;i>0;i--)
    
    {
        System.out.print(startNumber+", ");
        startNumber-=1;
        
            try 
            {
            Thread.sleep(1000);     }                   //DELAY EACH NUMBER CATCHING THE EXCEPTION TO ALLOW EXECUTION
            catch(java.lang.InterruptedException ie)
            {            }
       
       if (startNumber==0)
        System.out.print("BLAST OFF!");

}

    }
 
}
