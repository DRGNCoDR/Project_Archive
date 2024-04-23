
//Ray Fradella
import java.util.Scanner;
public class countChar
{
    Scanner input=new Scanner(System.in);
    
    public static void main(String[] args)
    {
        String txt;
        char character;
        
        Scanner input=new Scanner(System.in);
        
        ///////////////////////////
        //Gather input
        ///////////////////////////
        System.out.println("Enter a word");
        txt=input.next();
        System.out.println("Enter a character from that word");
        character=input.next().charAt(0);
       
        //Call function
        countChar(txt,character);
    }
    public static void countChar(String text,char charactr)
    {
        int count=0;
        
        //Count the number of times a letter appears
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)==charactr)
            {
                count+=1;
            }
        }
        
        //Print the output
        System.out.print("The character "+charactr+
                     " appears in the text: " + text+ 
                     " "+ count+" times");
    }
  
}
