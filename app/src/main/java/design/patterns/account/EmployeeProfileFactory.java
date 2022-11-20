package design.patterns.account;

public class EmployeeProfileFactory extends AbstractFactory {
    @Override
    public Profile createProfile() {
        return new EmployeeProfile();
    }
}
