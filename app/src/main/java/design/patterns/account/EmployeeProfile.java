package design.patterns.account;

import java.util.ArrayList;
import java.util.List;

import design.patterns.Thanks;

public class EmployeeProfile implements Profile{
    private String profileType = "employee";
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Thanks thanksBalance = Thanks.getInstance();
    private List<String> rewards = new ArrayList<>();
    private CompanyProfile companyProfile;

    public EmployeeProfile() {
        username = "anonEmployee";
        firstName = null;
        lastName = null;
        email = null;
        companyProfile = null;
    }

    public EmployeeProfile(String username, String firstName, String lastName, String email, CompanyProfile companyProfile) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.companyProfile = companyProfile;
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
        if (companyProfile != null) {
            return companyProfile.isPremium();
        }
        return false;
    }

    public void buyReward() {
        if (isPremium()) {
            thanksBalance.consumeThanks();
            System.out.println("You bought a reward!");
        } else {
            System.out.println("You cannot buy a reward!");
        }
    }

    public void linkCompanyProfile(CompanyProfile companyProfile) {
        this.companyProfile = companyProfile;
        this.companyProfile.addEmployee(this);
    }

    public String getCompanyName() {
        if (companyProfile != null) {
            return companyProfile.getUserName();
        } else {
            return "No company";
        }
    }

    @Override
    public String toString() {
        return "Username: " + username + "\n" 
        + "First Name: " + firstName + "\n" 
        + "Last Name: " + lastName + "\n" 
        + "Email: " + email + "\n" 
        + "Thanks Balance: " + thanksBalance.getThanks() + "\n" 
        + "Rewards: " + rewards + "\n" 
        + "Company: " + getCompanyName() + "\n" 
        + "Premium: " + isPremium();
    }
}
