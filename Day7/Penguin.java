public class Penguin extends Bird implements SwimBehaviour {
    
    public void sound() {
        System.out.println("Honking.... ");
    }
    
    public void swimming() {
        System.out.println("Penguins use wings for Swimming ");
    }
    
    public void wings() {
        System.out.println("Swim wings ");
    }
}