
import java.util.Scanner;
public class CSM 
{

public static void main(String[] args)
{
int numb1,numb2;

   System.out.println("In main()");
   
   Scanner input=new Scanner(System.in);
   
   func();
   System.out.print("Enter the from number ");
   numb1= input.nextInt();
   
   System.out.print("Enter the to number ");
   numb2= input.nextInt();
   
 
   sumFromTo(numb1,numb2);
   System.out.println("Leaving main()");
   
   }
   
   static void func( )
   {
   System.out.println("In func()");
    
   }
   ////////////////////////////
   //Logic Method
   ///////////////////////////
  static int sumFromTo(int number1,int number2)
   {  
     int diff=number2-number1;  //Get the difference of the numbers for determining how many times to run
     int sum=number2; 
     
     //ensure number gets displayed if it is not out of the range
     if((number1<number2)||(number1==number2))
     {
         
         for(int i=0;i<diff;i++) //Run calculation depending on the difference
         {
             if(number1<number2)
             {        
              sum+=number1;  
              number1+=1;
             }
            
        }
    //Print value
         System.out.println("The sum of the values in the set is "+sum);   
        }
    ///////////////////////
    //Display Error Message
    ///////////////////////
     if(number1>number2)
      {      
      System.out.println("ERROR: " +number2+" is less than "+ number1);
      return 0;
      }
     
      return sum;
   }
}

