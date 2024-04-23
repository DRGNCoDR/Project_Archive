import java.util.Scanner;

public class prj4
{   
    public static void main(String[] args)
    {       
        Administrator admin = new Administrator();   
        
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
        {
            System.out.print("\n---------------------------------------------\nPress 1 to add new patient\nPress 2 to add new employee.\n");
            
            String ch = input.next();
            int IDnum;    
            switch(ch)
            {
                case "1":System.out.print("Enter the new Patient ID: ");IDnum=input.nextInt();admin.addPatient(IDnum);break;
                case "2":System.out.print("Enter the new Employee ID: ");IDnum=input.nextInt();admin.addEmployee(IDnum);break;
            };
        }  
    }
}
