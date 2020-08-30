import java.util.Scanner;

public class IncorrectStrings 
{
	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter first string");                   
        String s1= scan.next();
        
        System.out.println("Enter second string");                   
        	String s2= scan.next();
        
        	String St2 = (s1.substring(2))+(s1.substring(0,2));      
        	String St1 = (s2.substring(2))+(s2.substring(0,2));      
        	System.out.println("Correct first string is :" + St1);    
        	System.out.println("Correct second string is :"+ St2);
        	
	}

}