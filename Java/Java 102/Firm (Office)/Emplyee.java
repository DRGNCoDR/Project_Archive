
/**
 * Write a description of class Emplyee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Emplyee extends StaffMember

{
  protected String socialSecurityNumber;
  protected double payRate;
  protected int vacationDays;
  
  public Emplyee(String eName,String eAddress,String ePhone,String socSecNumber,double rate,int Vacation)
  {
      super (eName,eAddress,ePhone);
      
      socialSecurityNumber=socSecNumber;
      payRate=rate;
      vacationDays=Vacation;
    }
    public String toString()
    {
        String result=super.toString();
        
        result+="\nSocial Security Number: "+socialSecurityNumber;
        result+="\nVacation Days: "+vacationDays;
        return result;
    }
    public double pay()
    {
        return payRate;
    }
}
