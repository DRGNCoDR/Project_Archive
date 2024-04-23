import java.util.Scanner;
public class Employee
{
    public int EmployeeID;
    
    public String FirstName,LastName;
    String password="---";
    
    Scanner input=new Scanner(System.in);
    public void changeName()
    {
        System.out.print("\nEnter a new First Name: ");
        FirstName=input.next();
        
        System.out.print("Enter a new Last Name: ");
        LastName=input.next();
    }
    public void changePassword()
    {
        System.out.print("Enter a new Password: ");
        password=input.next();        
        
        System.out.println("Password changed successfully.\n");
    }
    public void showEmployee()
    {
        System.out.println("  Name: "+FirstName + "  " +LastName);
        
        
    }
   
    
    
}
