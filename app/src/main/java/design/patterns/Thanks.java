package design.patterns;

/**
 * Singleton Design Pattern
 * 
 * Single instance of a class is created and shared across the application.
 * Garantees that given class has only one instance.
 * 
 * Here, there's only one instance of Thanks class, we can add or remove thanks but never
 * create a new instance of this class.
 */
public class Thanks {
    private int thanks = 0;
    private static final int bigThanks = 100;
    private static Thanks instance = new Thanks();

    // make the constructor private so that this class cannot be instantiated
    private Thanks() {
    }

    // Get the only object available
    public static Thanks getInstance() {
        return instance;
    }
    
    // Get Thanks
    public int getThanks() {
        return thanks;
    }
    
    // Add Thanks
    public void addThanks() {
        thanks++;
    }

    // Add Big Thanks
    public void addBigThanks() {
        thanks += bigThanks;
    }

    // Consume Thanks
    public void consumeThanks() {
        if (thanks > 0) {
            thanks--;
        }
        else {
            System.out.println("No thanks to consume.");
        }
    }

    // for debug
    public void resetThanks() {
        thanks = 0;
    }

    // toString
    public String toString() {
        return "Thanks: " + thanks;
    }
}
