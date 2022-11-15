package design.patterns;

import java.util.ArrayList;
import java.util.List;

public class UserProfile implements Profile {
    private String profileType = "user";
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Thanks thanksBalance = Thanks.getInstance();
    private List<String> rewards = new ArrayList<>();
    private boolean isPremium;

    public UserProfile() {
        username = "anonUser";
        firstName = null;
        lastName = null;
        email = null;
        isPremium = false;
    }

    public UserProfile(String username, String firstName, String lastName, String email, boolean isPremium) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isPremium = isPremium;
    }

    @Override
    public String getProfileType() {
        return profileType;
    }

    @Override
    public String getUserName() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public int getThanksBalance() {
        return thanksBalance.getThanks();
    }

    public List<String> getRewards() {
        return rewards;
    }

    @Override
    public boolean isPremium() {
        return isPremium;
    }

    public void buyReward() {
        if (isPremium) {
            thanksBalance.consumeThanks();
            System.out.println("You bought a reward!");
        } else {
            System.out.println("You cannot buy a reward!");
        }
    }

    public String toString() {
        return "Username: " + username + "\n" 
        + "First Name: " + firstName + "\n" 
        + "Last Name: " + lastName + "\n" 
        + "Email: " + email + "\n" 
        + "Thanks Balance: " + thanksBalance.getThanks() + "\n" 
        + "Rewards: " + rewards + "\n" 
        + "Premium: " + isPremium;
    }
}
