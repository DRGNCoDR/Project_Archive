//Calculate the distance between points
import java.util.Scanner;

public class DistanceCalculator
{
    public static void main(String[] args)
    {
        //////////////////////////////
        //Variables
        //////////////////////////////
        double pointX1,pointX2,pointY1,pointY2;
        Scanner input=new Scanner(System.in);
        
        ////////////////////////////////
        //Gather input
        ////////////////////////////////
        System.out.print("Enter the first X point: ");
        pointX1=input.nextDouble();
         System.out.print("Enter the second X point: ");
         pointX2=input.nextDouble();
          System.out.print("Enter the first Y point: ");
          pointY1=input.nextDouble();
           System.out.print("Enter the second Y point: ");
           pointY2=input.nextDouble();
           
        ////////////////////////////////////
        //Result
        ///////////////////////////////////
        pointX1=Math.pow(pointX2-pointX1,2);
        pointY1=Math.pow(pointY2-pointY1,2);
       System.out.print("The distance is: "+
            Math.sqrt(pointX1+pointY1));
        
    }
}
