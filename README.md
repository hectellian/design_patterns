# Design Patterns

## Singleton Design Pattern

Single instance of a class is created and shared across the application.
Garantees that given class has only one instance.

Here, there's only one instance of Thanks class, we can add or remove thanks but never
create a new instance of this class.

## Abstract Factory Design Pattern

 This pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

 Here we have a Profile creation system that can create either a UserProfile or a CompanyProfile.

 This is for the client to avoid to know the implementation details of the creation of the objects.

## Wrapper Design Pattern

This class is a wrapper for the CustomReward class.

It implements the Reward interface so that it can be used
in the same way as the other rewards.

## How to run

### **Requirements**

- Java OpenJDK 17+ (or similar)
- Gradle 7.5.1+

### **Manipulation**

Copy this repository (or unzip the zipped file):

```bash
git clone https://github.com/hectellian/design_patterns
```

Then for a build with tests run:

```bash
gradle clean build
```

To see output run:

```bash
gradle run
```
