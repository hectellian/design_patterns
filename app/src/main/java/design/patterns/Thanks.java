package design.patterns;

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
        thanks--;
    }

    // toString
    public String toString() {
        return "Thanks: " + thanks;
    }
}
