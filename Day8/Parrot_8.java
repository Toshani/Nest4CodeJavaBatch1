public class Parrot_8 extends Bird_8 implements Fly,EatBehaviour{
		
		public void fly() {
		      System.out.println("Parrot can fly");
		}
			      
			      public void swim() {
			    	  System.out.println("Parrot cannot swim");
			      }
			    	  @Override
			    	  public void eat(String item) {                        //overload method of eat//
			    		  System.out.println("Parrot eats chilly");

			    	  }
			    	  	
			    	  
			      }