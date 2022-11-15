package design.patterns;

public class CompanyProfileFactory extends AbstractFactory {
    @Override
    public Profile createProfile() {
        return new CompanyProfile();
    }
}
