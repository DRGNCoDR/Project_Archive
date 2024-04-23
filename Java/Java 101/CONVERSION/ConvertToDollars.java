

import java.util.Scanner; //import the scanner

public class ConvertToDollars
{
    public static void main(String[] args)
    {
        ////////////////////////////////////////////
        //VARIABLES
        ////////////////////////////////////////////        
        Scanner coins=new Scanner(System.in);
        double quarter,dime,nickle,penny,sum;
       
        /////////////////////////////////////////////
        //Get the number of coins of each type
        /////////////////////////////////////////////        
        System.out.println("How many quarters?");   //QUARTERS
        quarter=coins.nextDouble();
        sum=quarter*0.25;
         System.out.println("How many dimes?");     //DIMES
        dime=coins.nextDouble();
        sum+=dime*0.10;
         System.out.println("How many nickles?");   //NICKLES
        nickle=coins.nextDouble();
        sum+=nickle*0.05;
         System.out.println("How many pennies?");   //PENNIES
        penny=coins.nextByte();
        sum+=penny*0.01;
       
        /////////////////////////////////////////
        //Print out the sum of the coins value
        ////////////////////////////////////////       
        System.out.print("You have a total of $");
        System.out.println(sum);
        
    }
}
