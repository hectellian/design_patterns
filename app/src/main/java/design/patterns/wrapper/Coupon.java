package design.patterns.wrapper;

public class Coupon implements Reward {
    private int id;
    private double cost;

    public Coupon(int id, double cost) {
        this.id = id;
        this.cost = cost;
    }

    public String getDescription() {
        return "A coupon that can be used to buy a product.";
    }

    public double getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }
}
