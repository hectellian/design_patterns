package design.patterns.account;

public class CompanyProfileFactory extends AbstractFactory {
    @Override
    public Profile createProfile() {
        return new CompanyProfile();
    }
}
