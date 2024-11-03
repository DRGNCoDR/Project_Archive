/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package taggenerator;
import java.util.Scanner;
/**
 *
 * @author Ray F
 */
public class TagGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);         //input
        String[] location=new String[20];               //Locations
        
        boolean noMoreLoc = false;                        
        
        for(int index = 0; index <= location.length - 1; index++){
            if (noMoreLoc == false){
                System.out.print("Enter a new location or enter '--' to finish adding locations: ");
                
                location[index] = input.nextLine();     //Get next Input    
                
                if (location[index].equals("--")){      //Break out of loop if -- entered
                   noMoreLoc = true;
               }
               System.out.println("Locations Entered: " + index);
            }else{
                System.out.print("Enter the tag you would like to use: ");
               
                String tag =input.nextLine();
                
                for (index = 0; index <= location[index].length()-1; index++){
                    System.out.println(tag + " "+ location[index]);
                    System.out.println( location[index]+ " " +tag );
                }
            }
        }
    }
    
}
