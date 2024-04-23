//Ray Fradella
import java.util.Scanner;
public class floatEquals
{    
    
 public static void main(String[] args)
 {
     Scanner input=new Scanner(System.in);
     float value1,value2;
     float tolerance;
    ///////////////////////////////////////
    //Gather input
    ///////////////////////////////////////
       System.out.print("Enter the first floating point value:     ");
       value1=input.nextFloat();
       
       System.out.print("Enter the second floating point value:    ");
       value2=input.nextFloat();
       
       System.out.print("Enter the tolerance value:      ");
       tolerance=input.nextFloat();
       
     //Constructor
       floatEquals(value1,value2,tolerance);
 }

  
  public  static void floatEquals(float v1,float v2, float tol)
  { 
      // find if values are equal with regard to tolerance
        if(Math.abs(v1-v2)<tol)
        {
            System.out.println("The numbers are Equal with regard to the Tolerance");
        }
        else
        {
            System.out.println("The numbers are Not Equal with regard to the Tolerance ");
        }
  }
}
