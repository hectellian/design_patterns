package design.patterns;

import design.patterns.account.*;;

public class Client {
    public static void main(String[] args) {
        // Singleton
        Thanks thanks = Thanks.getInstance();

        thanks.addThanks();
        System.out.println(thanks.toString());

        thanks.addBigThanks();
        System.out.println("After adding big thanks: " + thanks.toString());

        // Absract Factory
        AbstractFactory profileFactory = FactoryProducer.getFactory("user"); // true for user, false for company
        Profile user = profileFactory.createProfile();
        AbstractFactory employeeFactory = FactoryProducer.getFactory("employee");
        Profile employee = employeeFactory.createProfile();

        System.out.println(user.toString() + "\n");
        System.out.println(employee.toString() + "\n");

        AbstractFactory companyFactory = FactoryProducer.getFactory("company"); // true for user, false for company
        Profile company = companyFactory.createProfile();

        System.out.println(company.toString());

        // Wrapper
        
    }
}
