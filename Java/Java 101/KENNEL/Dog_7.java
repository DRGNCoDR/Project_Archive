
/**
 * Write a description of class Dog_7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Dog_7
{
   private String name;
   private int age;
   
   //Constructor
   public Dog_7(String name, int Age)//Constructor
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

