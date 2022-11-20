package design.patterns.wrapper;

public class Thank implements Reward {
    private int id;

    public Thank(int id) {
        this.id = id;
    }

    public String getDescription() {
        return "Thanking the user for doing a task.\n"
                + "Can be used to buy other rewards if the user is premium.";
    }

    public double getCost() {
        return 0.0;
    }

    public int getId() {
        return id;
    }
}
