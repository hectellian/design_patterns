package design.patterns.account;

import java.util.ArrayList;
import java.util.List;

public class CompanyProfile implements Profile {
    private String profileType = "company";
    private String companyName;
    private String email;
    private boolean isPremium;
    private List<EmployeeProfile> employees = new ArrayList<>();

    public CompanyProfile() {
        companyName = "anonCompany";
        email = null;
        isPremium = false;
    }

    public CompanyProfile(String companyName, String email, boolean isPremium) {
        this.companyName = companyName;
        this.email = email;
        this.isPremium = isPremium;
    }

    @Override
    public String getProfileType() {
        return profileType;
    }

    @Override
    public String getUserName() {
        return companyName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public boolean isPremium() {
        return isPremium;
    }

    public List<EmployeeProfile> getEmployees() {
        return employees;
    }

    public void setReward() {
        if (isPremium) {
            System.out.println("You have been rewarded with custom rewards!");
        } else {
            System.out.println("You have been rewarded with thanks!");
        }
    }

    public void addEmployee(EmployeeProfile employeeProfile) {
        employees.add(employeeProfile);
    }

    public String toString() {
        return "Company name: " + companyName + ", email: " + email + ", isPremium: " + isPremium;
    }
}
