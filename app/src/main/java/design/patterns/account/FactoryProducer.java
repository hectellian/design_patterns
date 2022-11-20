package design.patterns.account;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("USER")) {
            return new UserProfileFactory();
        } else if (choice.equalsIgnoreCase("COMPANY")) {
            return new CompanyProfileFactory();
        } else if (choice.equalsIgnoreCase("EMPLOYEE")) {
            return new EmployeeProfileFactory();
        } else {
            return null;
        }
    }
}
