

public class Administrator
{
    int EmployeeID,PatientID;
    Employee employee=new Employee();
    Doctor  patient=new Doctor();
   
    public void addEmployee(int EmpID)
    {
        EmployeeID=EmpID;      
        
        employee.changeName();
        employee.changePassword();
        
        
        System.out.println("Employee " + EmployeeID + ":");
        employee.showEmployee();
    }
    public void addPatient(int pID)
    {
        PatientID=pID;
        
        patient.patientVisit();
        patient.addNotes();
        
        
        System.out.println("Patient: " + pID + ":");
        patient.lastVisit();
        
    }
}
