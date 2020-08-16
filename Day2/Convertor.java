import java.util.*;  
public class Convertor
{
    public static double heightConvertor(int heightFeetPart, int heightInchPart)
    {
        return ((12*2.54*heightFeetPart)+(2.54 * heightInchPart));
    }    
    public static double weightConvertor(int weight)
    {
        return (2.2*weight);
    }
    public static void main(String[] args)
    {
        int height_feet, height_inch, weight_kg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        System.out.println("Height in feet and inch an weight in kg:");
        height_feet = sc.nextInt();
        height_inch = sc.nextInt();
        weight_kg = sc.nextInt();
        double h_cm = heightConvertor(height_feet,height_inch);
        double wt_pound = weightConvertor(weight_kg);
        System.out.println("Height in cm: "+h_cm);
        System.out.println("Weight in pounds "+wt_pound);
    }
}
