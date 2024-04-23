
/**
//Update dogs in the kennel and their attributes
 */
import java.util.Scanner;
public class Dog
{ 
   private String name;
   private int age;
   
   //Constructor
   public Dog(String name, int Age)//Constructor
   {         
      setDogName(name);
      setDogAge(Age);      
   }
   
   ///////////////////////////////
   //Getters and Setters
   //////////////////////////////
   public String getDogName()
   {
       return name;
    }
    private void setDogName(String name)
    {
        
        this.name=name;
        
    }
    
   public int getDogAge()
   {
       return age;
    }
    private void setDogAge(int age)
    {
        this.age=age;        
    }
   
    /////////////////////////////
    //To String method
    ///////////////////////////// 
    
    public String toString()
{
    String result=Integer.toString(age);
    return result;
        
}
}
