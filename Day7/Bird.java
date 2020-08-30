public abstract class Bird {
    
    int height;
    int weight;
    String type;
    String color;
    
    //abstract methods
    
    public abstract void sound();
    
    public abstract void wings();
    
    // non-abstract methods
    
    public static void sleeping() {
        System.out.println("Sleeping ");
    }
    
    public static void eating() {
        System.out.println("Eating ");
    }
}