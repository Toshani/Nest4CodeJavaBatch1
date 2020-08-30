public class Penguin_8 extends Bird_8 implements Swim,EatBehaviour{
	

	public void fly() {
	      System.out.println("Penguin can fly");
	}
	      
		      
		      public void swim() {
		    	  System.out.println("Penguin can swim");
		      }
		    	  @Override
		    	  public  void eat(String item) {                     //overload method of eat//
		    		  System.out.println("Penguin eats fish");
		    		
		      }
}	