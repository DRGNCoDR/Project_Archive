
/**
 * Write a description of class Executive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Executive extends Emplyee
{
   private double bonus;
   
   public Executive(String eName,String eAddress,String ePhone,String socSecNumber,double rate,int vacation)
   {
       super(eName,eAddress,ePhone,socSecNumber,rate,vacation);
       
       bonus=0;
    }
    public void awardBonus(double execBonus)
    {
        bonus=execBonus;
    }
    public double pay()
    {
        double payment =super.pay()+bonus;
        bonus=0;
        return payment;
    }
}
