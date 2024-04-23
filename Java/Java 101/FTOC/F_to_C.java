
/**
 * Convert farenhight to celcius based on user inpout
 * 
 * @author (Ray Fradella) 
 * @version (a version number or a date)
 */
import java.util.Scanner;//import the scanner
public class F_to_C
{
    public static void main(String[] args)
    {
    /////////////////////
    //Variables required for conversion
    /////////////////////
        final int base=32;
        final double CONVERSION_FACTOR=5.0/9.0;
        
        //setup the input scanner
        Scanner degree = new Scanner(System.in);
   //////////////////////     
   //Collect the degrees from the user 
   //////////////////////    
   System.out.println("Enter the degrees in F");   
   double Farenhight= degree.nextDouble();  //Gather input
   //////////////////////
   //Display Result
   //////////////////////
   System.out.println("The degrees in celsius is:");
   System.out.println((Farenhight-base)*CONVERSION_FACTOR);//Convert/Show the number
}
}
