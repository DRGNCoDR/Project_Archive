
/**
 * Write a description of class Volunteer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Volunteer extends StaffMember
{
  public Volunteer(String eName,String eAddress,String ePhone)
  {
      super(eName,eAddress,ePhone);
    }
    public double pay()
    {
        System.out.println("Vacation Days: " + "None");
        return 0.0;
    }
    
}
