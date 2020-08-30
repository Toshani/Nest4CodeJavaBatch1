public abstract class Bird_8 
{            // Abstract class Bird//
	
	String color;                        //Properties//
	int  height;                                       
	int weight;                           
	String sound;
	String item;
	
	
public void sleep() 
{                        //second non abstract method//            
	System.out.println("All birds sleep");
}

public abstract void fly();                        //first abstract method//
public abstract void swim();                        //second abstract method//
public abstract void eat(String item);                        //third first abstract method eat //


}