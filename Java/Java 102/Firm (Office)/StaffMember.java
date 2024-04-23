
/**
 * Write a description of class StaffMember here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class StaffMember
{
  protected String name;
  protected String address;
  protected String phone;
  
  ///////////////////////////
  //Constructor
  //////////////////////////
  public StaffMember( String eName,String eAddress,String ePhone)
  {
     name=eName;
     address=eAddress;
     phone=ePhone;         
}
////////////////////////
//Returns Employee information
////////////////////
public String toString()
{
    String result = "Name: "+ name+"\n";
    
    result+="Address: "+address+"\n";
    result+="Phone: " +phone;
    
    return result;
}
public abstract double pay();
}
