package design.patterns;

import org.junit.jupiter.api.*;

import design.patterns.account.*;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @BeforeAll
    static void setup() {
        System.out.println("--Account Creation Test--");
    }

    @Test
    @DisplayName("Create User Account Test")
    void createUserAccount() {
        AbstractFactory profileFactory = FactoryProducer.getFactory("user");
        Profile user = profileFactory.createProfile();
        assertEquals("user", user.getProfileType());
    }

    @Test
    @DisplayName("Create Employee Account Test")
    void createEmployeeAccount() {
        AbstractFactory profileFactory = FactoryProducer.getFactory("employee");
        Profile employee = profileFactory.createProfile();
        assertEquals("employee", employee.getProfileType());
    }

    @Test
    @DisplayName("Create Company Account Test")
    void createCompanyAccount() {
        AbstractFactory companyFactory = FactoryProducer.getFactory("company");
        Profile company = companyFactory.createProfile();
        assertEquals("company", company.getProfileType());
    }

    @AfterAll
    static void tearDown() {
        System.out.println("--Account Creation Test Complete--");
    }
}
