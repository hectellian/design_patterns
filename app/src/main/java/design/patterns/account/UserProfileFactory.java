package design.patterns.account;

public class UserProfileFactory extends AbstractFactory {
    @Override
    public Profile createProfile() {
        return new UserProfile();
    }
}
