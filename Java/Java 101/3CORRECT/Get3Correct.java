//Raymond Fradella
import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;

public class Get3Correct
{
    public static void main(String[] args)
    {
//////////////////////////////////////////
//Variables
//////////////////////////////////////////
        double answer;
        
        int number1,number2,
            correct=0,
            numRight=0,
            operand,
            incorrect=0;
            
        String operation;
        
        NumberFormat nmbrFmt=NumberFormat.getPercentInstance();
        
        Random rand=new Random();
        
        Scanner input=new Scanner(System.in);
////////////////////////////////////////////
//While Loop
////////////////////////////////////////////
       while(correct<3)
       {
///////////////////////////
//Random Number Generation
///////////////////////////
        number1=rand.nextInt(99)+1;
        number2=rand.nextInt(99)+1;
        operand=rand.nextInt(2)+1;
///////////////////////////
//Switch loop
///////////////////////////
         switch(operand)   
           {
            case 0:operation="+";System.out.print(number1+operation + number2+ " = ");          //////////////////////////////////////////////
                    answer=input.nextInt();                                                     //ORDER OF EACH CASE CODE
                                                                                                //Show the operation (+,-,*)
                if(answer==number1+number2)                                                     //Print out instructions to user
                {                                                                               //Gather Answer
                    numRight+=1;                                                                //Update correct answer/incorrect storage value
                    correct+=1;                                                               /////////////////////////////////////////////
                }
                else
                incorrect+=1;break;   
            
            case 1:operation="-";System.out.print(number1+operation + number2+ " = ") ;
                    answer=input.nextInt();
        
                if(answer==number1-number2)
                {
                    numRight+=1;
                    correct+=1;
                }
                else
                incorrect+=1;break;    
            
            case 2:operation="*";System.out.print(number1+operation + number2+ " = "); 
                    answer=input.nextInt();
        
                if(answer==number1*number2)
                {
                    numRight+=1;
                    correct+=1;
                }
                else
                incorrect+=1;break;         
                
            }                                      
      }    
       System.out.print("You got "+numRight+" correct. The number of incorrect answers was "+incorrect);      //PRINT OUT FINAL RESULT
    }                      
}
