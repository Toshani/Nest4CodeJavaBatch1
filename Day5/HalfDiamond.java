import java.util.*;
public class HalfDiamond
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int num = sc.nextInt();
        for (int i=0;i<=num;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=num-1;i>=0;i--)
        {
            for (int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
