
/**
 * Write a description of class Staff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Staff
{
 private StaffMember[] staffList;
 
 public Staff()
 {
     staffList = new StaffMember[6];
     
     staffList[0]= new Executive("Tony","123 Main Line", "555-0469", "123-45-6789",2423.07,21);
     
     staffList[1]= new Emplyee("Paulie","465 Off Lane","555-0101","987-65-4321",1246.15,14);
     staffList[2]= new Emplyee("Vito","789 Off Rocker","555-0000","010-20-3040",1169.23,14);
     
     staffList[3]= new Hourly ("Michael","678 Fifth Ave.","555-0690","958-47-3625",10.55,7);
     
     staffList[4]= new Volunteer("adrianna","987 Babe Blvd.","555-8374");
     staffList[5]= new Volunteer("Benny", "321 Dud Lane","555-7282");
     
     ((Executive)staffList[0]).awardBonus(500.00);
     
     ((Hourly)staffList[3]).addHours(40);
    }
    /////////
    //Pay all employees
    /////////
    public void payday()
    {
        double ammount;
        
        for (int count=0;count < staffList.length;count++)
        {
            System.out.println(staffList[count]);
            
            ammount= staffList[count].pay();
            
            if(ammount==0)
            System.out.println("Thanks!");
            else
            System.out.println("Paid: "+ammount);
            
            
            System.out.println("-----------------------------------");
        }
    }
}
