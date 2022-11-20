package design.patterns.wrapper;

/**
 * This class is a wrapper for the CustomReward class.
 * It implements the Reward interface so that it can be used
 * in the same way as the other rewards.
 */
public class CustomAdapter implements Reward {
    private CustomReward customReward;

    public CustomAdapter(CustomReward customReward) {
        this.customReward = customReward;
    }

    public String getDescription() {
        return customReward.getDescription();
    }

    public double getCost() {
        return 0.0;
    }

    public int getId() {
        return customReward.getId();
    }
}
