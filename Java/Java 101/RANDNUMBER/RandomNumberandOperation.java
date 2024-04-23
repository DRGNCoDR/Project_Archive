//Raymond Fradella


import java.util.Scanner;
import java.util.Random;

public class RandomNumberandOperation
{
    public static void main(String[] args)
    { 
        //////////////////////////////
        //Variables
        //////////////////////////////
            Scanner input=new Scanner(System.in);
        
            int number,randNum,randNum2,operand;
        
            Random rand=new Random();
        
            String operation;
        /////////////////////////////
        //Gather input
        ////////////////////////////
        
            //Random
                randNum=rand.nextInt(99)+1;     //1st number
                randNum2=rand.nextInt(99)+1;    //2nd number
                operand=rand.nextInt(3);        //Decide the random arithmetic         
                operation=new String();         //The operation string +,-,*)
        
          switch(operand)   //Assign operation value
           {
            case 0:operation="+";break;            
            case 1:operation="-";break;            
            case 2:operation="*";break;         
            }
        
        System.out.println(randNum+ operation +randNum2+" = ?");    //Ask the first question
        
          number=input.nextInt();   //User answer to the question
        
           switch(operand)      //Preform the calculation
            {
            case 0:randNum=(int)randNum + (int)randNum2;;break;            
            case 1:randNum=(int)randNum - (int)randNum2;;break;            
            case 2:randNum=(int)randNum * (int)randNum2;;break;                 
            }
        
        
        ///////////////////////////
        //Odd or Even
        //////////////////////////
        
            if (number==randNum )   //correct text displays
            {
                System.out.print("Correct! The number was "+randNum);
            }
            else                    //incorrect text displays
            
                System.out.print("Incorrect! The correct number was "+randNum);
        
    }
}
