
/**
 * Write a description of class BodyMassDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BodyMassDemo
{
  public static void main (String [] args)
  {
      double weight;
      double height;
       
       Scanner keyboard = new Scanner(System.in);
       BodyMassIndex bmi = new BodyMassIndex();
        
       // Read the weight
       System.out.println("Enter the weight of the user.");
       weight = keyboard.nextDouble();
       bmi.setWeight(weight);
       // Read the height
       System.out.println("Enter the height of the user.");
       height = keyboard.nextDouble();
       bmi.setHeight(height);
       // Display the body mass index
       System.out.println("The body mass index is: "+bmi.getBMI());
       System.out.println("The body mass index category is "+bmi.getCategory());
    }
}

    
