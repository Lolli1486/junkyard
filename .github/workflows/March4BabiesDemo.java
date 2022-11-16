import java.io.File;
import java.io.FileNotFoundException; // Needed for PrintWriter and IOException
import java.util.Scanner; // Needed for Scanner class
import java.io.*;
import java.util.StringTokenizer;

/**
* Chapter 5
* Programming Challenge 3: Distance File
* This program demonstrates the Distance class.
*/
public class March4BabiesDemo
{
   public static void main(String[] args)throws IOException
   {
     int participants = 18; // # of participants
     String filename; // File name
       
     
     
     String[] raceList = new String[participants];//hold data from txt file
     String[] LastNFirst = new String[participants];//array to hold name
     String[] department = new String[participants];//array to hold dept
     double[] miles = new double[participants];  //hold miles per participant
     double[] pledges = new double[participants]; //pledges per participant
     //double[] totalPledge = new double[participants];//pledges per person
     
     // Create a Scanner object for keyboard input.
     Scanner keyboard = new Scanner(System.in);
        FileReader freader = new FileReader("testingexam.txt"); 
        BufferedReader inputFile = new BufferedReader(freader);
        March4Babies march = new March4Babies();
    
         for (int index = 0; index < participants; index++)
        {
            raceList[index] = inputFile.readLine();
        }
            inputFile.close();

            for (int index = 0; index < raceList.length; index++)
        {
            System.out.println(raceList[index]);
        }
            
            // loop to read each line, separate into tokens, and save to arrays
            for (int index = 0; index < raceList.length; index++)
        {
              // StringTokenizer class to separate each line into separate variables
             StringTokenizer strTokenizer = new StringTokenizer(raceList[index], ",");
             raceList[index] = strTokenizer.nextToken();
             department[index] = strTokenizer.nextToken();
             LastNFirst[index] =strTokenizer.nextToken();
             miles[index] = Double.parseDouble(strTokenizer.nextToken());
            // pledges[index] = Double.parseDouble(strTokenizer.nextToken());
            // System.out.println(march.getTotalPledge(index));
             
               if (miles[index] >= 15)
         {
             System.out.println("Participants that walked at least 15 miles: "+ LastNFirst[index]);
         }
         }
         
         // if (miles[index] >= 15)
         // {
             // System.out.println( department[index]);
         // }
        
         
}
}
 