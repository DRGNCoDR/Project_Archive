

//Keep track of the dogs in a kennel
 
// * @Ray Fradella

 import java.util.Scanner;// Scanner
public class Kennel
{
public static void main(String[] args)
{
    Scanner input= new Scanner(System.in);
   
    //Declare the class
  
  
    System.out.print("What is the first dog's name? ");
    String name=input.next();
    
    System.out.print("What is the first dog's age? ");
    int age=input.nextInt();
    
    Dog dog1=new Dog(name,age);

     System.out.print("What is the second dog's name? ");
     name=input.next();
    
    System.out.print("What is the second dog's age? ");
    age=input.nextInt();
    
    Dog dog2=new Dog(name,age);
    
    System.out.println("The first dog is " +dog1.getDogName()+ " Age: " +dog1.getDogAge());
     System.out.print("The second dog is " +dog2.getDogName()+ " Age: " +dog2.getDogAge());
    
    

      
      
   
}
    
   
}
