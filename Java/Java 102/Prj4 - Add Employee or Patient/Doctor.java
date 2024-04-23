import  java.util.Scanner;

public class Doctor
{
        Scanner input=new Scanner(System.in);
        String notes,doctor,patient;
   public void addNotes()
   {
       System.out.println("\nEnter notes to add to the patient's account");
       
       notes=input.next();
        System.out.println("Notes added!\n");
       
    }
    public void patientVisit()
    {
        
        System.out.println("\nEnter the name of the patient");
        
        patient=input.next();
              
        System.out.println("Enter the name of the doctor who saw the patient");
        
        doctor=input.next();
        System.out.println(patient+ "'s file was updated with Dr. "+ doctor+ "'s visit");
    }
    public void lastVisit()
    {
        System.out.print(patient+"'s last visit was with Dr." + doctor+". and the doctor added the following notes: \n"+notes);
    }
}
