package design.patterns.wrapper;

public class CustomReward {
    private int id;
    private String description;

    public CustomReward(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
}
