
/**
 * Write a description of class Hourly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hourly extends Emplyee
{
  private int hoursWorked;
  public Hourly(String eName,String eAddress,String ePhone,String socSecNumber,double rate,int vacation)
  {
      super (eName,eAddress,ePhone,socSecNumber,rate,vacation);
      
      hoursWorked=0;
    }
    public void addHours(int moreHours)
    {
        hoursWorked+=moreHours;
    }
    public double pay()
    {
        double payment =payRate*hoursWorked;
        
        hoursWorked=0;
        
        return payment;
    }
    public String toString()
    {
        String result=super.toString();
        
        result+="\nCurrent Hours: "+hoursWorked;
    
        return result;
    }
}
