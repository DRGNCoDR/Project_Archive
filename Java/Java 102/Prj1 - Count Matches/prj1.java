import java.util.*;
/**
 PP 7.1 Read an arbitrary number of integers 0 - 50 and count how many occurances of each are entered
 Print all values that show one time or more
 */
public class prj1
{
  //Global Variables
    Scanner scn=new Scanner(System.in);
    public static void main()
    {
        
        Scanner scn=new Scanner(System.in);                                     //Input
        Random rand=new Random(51);                                             //Random number
        int userNum, timesOccur = 0;                                            //user number and the times repeated
            
        System.out.println("Enter a number between 0 and 50");                  //Where the user enters the number
        userNum = scn.nextInt();                                                //Get User Number
        
    
        
        for(int i = 1; i < 50; i++)                                             //loop 50 times
        {
            int[] group = new int[50];                                          //array initialization
            group[i] = rand.nextInt(50);                                        //start generating random numbers at position 1
            
            if (group[i] == userNum)
            {
                timesOccur+=1;                                                  //Count the ammount of timees user number repeats
            }
            System.out.println("Array[" + i + "]=  " + group[i]);               //print the array
        }   

        System.out.println("Value: " + userNum + " Occured: " + timesOccur);    //print times occured.
  
    }
}
