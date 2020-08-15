import java.util.*;  
public class RestaurantBill
{
        public static void main (String[] args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Input:");
            System.out.println("\nprice 1: ");
            float in1= sc.nextFloat();  
            System.out.println("price 2: ");
            float in2= sc.nextFloat(); 
            System.out.println("price 3: ");
            float in3= sc.nextFloat(); 
            System.out.println("tax %: ");
            float tax= sc.nextFloat(); 
            float sum = in1 + in2 + in3;
            float amount = sum + (sum * (tax/100));
            System.out.println("Final Amount: "+amount);
        }
    }