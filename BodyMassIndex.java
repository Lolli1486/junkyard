
/**
 * Write a description of class BodyMassIndex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BodyMassIndex
{
    private double weight;
    private double height;
    //Constructor
    public BodyMassIndex()
    {
    }
    //set weight
    public void setWeight(double w)
    {
        weight = w;
    }
    //set height
    public void setHeight(double h)
    {
        height = h;
    }
    //Returns weight
    public double getWeight()
    {
        return weight;
    }
    //returns height
    public double getHeight()
    {
        return height;
    }
    //compute BMI
    public double getBMI()
    {
        return weight * 703 / (height * height);
    }
    //Determine weight category
    public String getCategory()
    {
        String message;
        if (getBMI() >= 25)
        {
        message = "Overweight";
        }
        else if (getBMI() > 18.5)
            {
            message = "Optimal weight";
            }
            else
            {
            message = "Underweight";
            }
            return message;
    }
}