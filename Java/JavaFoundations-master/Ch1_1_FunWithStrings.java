import java.util.Scanner;

/**
 * A compilition of string problems from a textbook on java
 *
 * @author (Raymond Fradella)
 * @version (v1.0)
 */
public class FunWithStrings
{
   public static void main(String[] args){
         /**
         * Ch1_3 - About Me
         */
        //Print with \n - newline and \t - tab
        System.out.print("*Chapter 1_3 - About Me\n");
        System.out.print("Name:\t\t\t\tRaymond Fradella\n");

        //println
        System.out.println("Birthday:\t\t\tJan 10, 1999");
        System.out.println("Hobbies:\t\t\tProgramming");
        System.out.println("Favorite Book:\t\tLord of the Rings");
        System.out.println("Favorite Movie:\t\tLord of the Rings\n");

        /**
         * Ch1_4 - Print a phrase 3 ways
         */
         System.out.print("\n*Chapter 1_4 - Print a phrase 3 ways\n");
        System.out.println("Knowledge is power\n");        //part a

        System.out.print("Knowledge\nis\npower\n\n");      //part b

        System.out.println("|====================|");      //part c
        System.out.println("| Knowledge is power |");
        System.out.println("|====================|");

         /**
         * Ch1_7 - Print star diamond
         */
         System.out.print("\n*Chapter 1_7 - Print star diamond\n");
         int n = 5;
         int space = n - 1;

        // run loop (parent loop)
        // till number of rows
        for (int i = 0; i < n; i++)
        {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i+1 stars
            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }

        // Repeat again in
        // reverse order
        space = 0;

        // run loop (parent loop)
        // till number of rows
        for (int i = n; i > 0; i--)
        {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i stars
            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;
        }

        /**
         *  Ch1_8 - Display Initials
         */
         System.out.print("\n*Chapter 1_8 - Display Initials\n");
        System.out.println("RRRRRRRRRRR    JJJJJJJJJJJJJJJ   FFFFFFFFFFFF");
        System.out.println("RRR       RRR  JJJJJJJJJJJJJJJJ  FFFFFFFFFFF ");
        System.out.println("RRR       RRR          JJJJ      FFF         ");
        System.out.println("RRR      RR    JJJJ    JJJJ      FFFFFF      ");
        System.out.println("RRRRRRRRRR      JJ     JJJJ      FFFFF       ");
        System.out.println("RRRRRRRRRRRR     J     JJJJ      FFF         ");
        System.out.println("RRR       RRR     JJJJJJJJ       FFF         ");
   }
}
