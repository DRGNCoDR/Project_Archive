//Raymond Fradella

//Raymond Fradella

import java.util.Scanner;
import java.util.Random;

public class MathTe
{
    public static void main(String[] args)
    { 
        //////////////////////////////
        //Variables
        //////////////////////////////
        Scanner input=new Scanner(System.in);
        int number,randNum,randNum2,su;
        Random rand=new Random();
        
        /////////////////////////////
        //Gather input
        ////////////////////////////
        randNum=rand.nextInt(99)+1;
        randNum2=rand.nextInt(99)+1;
        
        System.out.println(randNum+ " + "+randNum2+" = ?");
        randNum=(int)randNum+(int)randNum2;
        number=input.nextInt();
        
        ///////////////////////////
        //Odd or Even
        //////////////////////////
        
        if (number==randNum )
        {
            System.out.print("Correct! The number was "+randNum);
        }
        else
            System.out.print("Incorrect! The correct number was "+randNum);
        
    }
}
