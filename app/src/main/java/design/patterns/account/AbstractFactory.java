package design.patterns;

/**
 * Abstract Factory
 *
 * This pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 * Here we have a Profile creation system that can create either a UserProfile or a CompanyProfile.
 * This is for the client to avoid to know the implementation details of the creation of the objects.
 */
public abstract class AbstractFactory {
    abstract Profile createProfile();
}
