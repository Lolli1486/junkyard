public class March4Babies
{
     int participants = 18; // # of participants
     String filename; // File name
    
     
     
     String[] raceList = new String[participants];//hold data from txt file
     String[] LastNFirst = new String[participants];//array to hold name
     String[] department = new String[participants];//array to hold dept
     int[] miles = new int[participants];  //hold miles per participant
     double[] pledges = new double[participants]; //pledges per participant
     double[] totalPledge = new double[participants];//pledges per person
     
    
    //Compute the total amount of pledges obtained per person.
    //Miles walked * pledge amount per mile
   public double getTotalPledge(int index)
   {
       totalPledge[index] = (miles[index]) * (pledges[index]);
       return totalPledge[index];
   }
   
   //public double
}