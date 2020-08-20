import java.util.*;
import java.lang.Math;
public class CountDigits
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        long num = sc.nextLong();
        num = Math.abs(num);
        long rem;
        int oct=00, ect=00;
        while(num>0)
        {
            rem=num%10;
            if((rem%2)==0)
            {
              ect+=1;  
            }
            else
            {
                oct+=1;
            }
            num=(long)(num/10);
        }
        System.out.println("Odd digit: "+oct);
        System.out.println("Even digit: "+ect);
    }
}
