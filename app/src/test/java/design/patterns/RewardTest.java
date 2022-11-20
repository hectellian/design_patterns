package design.patterns;

import org.junit.jupiter.api.*;
import design.patterns.wrapper.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RewardTest {
    @BeforeAll
    static void setup() {
        System.out.println("--Reward Test--");
    }

    @Test
    @DisplayName("Thanks Description Test")
    void thanksDescription() {
        Thank thanks = new Thank(1);
        assertEquals("Thanking the user for doing a task.\n"
                + "Can be used to buy other rewards if the user is premium.", thanks.getDescription());
    }

    @Test
    @DisplayName("Coupon Description Test")
    void couponDescription() {
        Coupon coupon = new Coupon(1, 10.0);
        assertEquals("A coupon that can be used to buy a product.", coupon.getDescription());
    }

    @Test
    @DisplayName("Custom Reward Description Test")
    void customRewardDescription() {
        CustomReward customReward = new CustomReward(1, "A custom reward.");
        assertEquals("A custom reward.", customReward.getDescription());
    }

    @Test
    @DisplayName("Thanks Cost Test")
    void thanksCost() {
        Thank thanks = new Thank(1);
        assertEquals(0.0, thanks.getCost());
    }

    @Test
    @DisplayName("Coupon Cost Test")
    void couponCost() {
        Coupon coupon = new Coupon(1, 10.0);
        assertEquals(10.0, coupon.getCost());
    }

    @Test
    @DisplayName("Custom Reward Cost Test")
    void customRewardCost() {
        CustomAdapter customReward = new CustomAdapter(new CustomReward(1, "A custom reward."));
        assertEquals(0.0, customReward.getCost());
    }

    @Test
    @DisplayName("Thanks Id Test")
    void thanksId() {
        Thank thanks = new Thank(1);
        assertEquals(1, thanks.getId());
    }

    @Test
    @DisplayName("Coupon Id Test")
    void couponId() {
        Coupon coupon = new Coupon(1, 10.0);
        assertEquals(1, coupon.getId());
    }

    @Test
    @DisplayName("Custom Reward Id Test")
    void customRewardId() {
        CustomReward customReward = new CustomReward(1, "A custom reward.");
        assertEquals(1, customReward.getId());
    }

    @Test
    @DisplayName("Reward List Test")
    void rewardList() {
        List<Reward> rewards = new ArrayList<>();
        rewards.add(new Thank(1));
        rewards.add(new Coupon(2, 10.0));
        rewards.add(new CustomAdapter(new CustomReward(3, "A custom reward.")));
        assertEquals(3, rewards.size());
    }

    @Test
    @DisplayName("Adapter is Reward Test")
    void adapterIsReward() {
        CustomReward customReward = new CustomReward(1, "A custom reward.");
        CustomAdapter customAdapter = new CustomAdapter(customReward);
        assertTrue(customAdapter instanceof Reward);
    }

    @Test
    @DisplayName("Sum of Costs Test")
    void sumOfCosts() {
        List<Reward> rewards = new ArrayList<>();
        rewards.add(new Thank(1));
        rewards.add(new Coupon(2, 10.0));
        rewards.add(new CustomAdapter(new CustomReward(3, "A custom reward.")));
        double sum = rewards.stream().mapToDouble(
                reward -> reward.getCost()).sum();
        assertEquals(10.0, sum);
    }

    @Test
    @DisplayName("Random Reward Test")
    void randomReward() {
        List<Reward> rewards = new ArrayList<>();
        rewards.add(new Thank(1));
        rewards.add(new Coupon(2, 10.0));
        rewards.add(new CustomAdapter(new CustomReward(3, "A custom reward.")));
        Random random = new Random();
        Reward reward = rewards.get(random.nextInt(rewards.size()));
        assertTrue(reward instanceof Reward);
    }

    @AfterAll
    static void teardown() {
        System.out.println("--Reward Test--");
    }
}
