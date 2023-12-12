# Interfaces

## Contract vs Implementation

- An interface enforces a contract. It does not contain implementation
  - Contract:
    - Method signatures that constrain what's possible in a class
    - Defin name, inputs, and outputs of a method but do not include executable code
  - Implementation:
    - Executable code, including the statements and expressions inside a code block

## Declaration

- An interface declaration is similar to a class declaration

```java
public interface Vehicle {
    void accelerate();
    String getVelocityMessage();
}
```

- Differences:
  - uses the keyword interface vs class
  - Does not inlcude constructors
  - Method declarations are terminated iwth a semicolon and do not include code blocks
  - No instance fields
- Similarities:

  - Names are ProperCase
  - Stored in own source file

- The vehicle interfaace defines what it means to be a vehicle, but does not include executable code to sole the problem.

## Implemetation

```java
public class Truck implements Vehicle {
    private static final int MAX_KM_PER_HOUR = =195;
    private int kilometersPerHour = 0;

    @override
    public void accelerate() {
        kilometersPerHour = Math.min(kilometersPerHour + 10, MAX_KM_PER_HOUR);
    }

    @override
    public String getVelocityMessage() {
        return String.format("%s km/hr", kilometersPerHour);
    }
}
```

- The implement keyword is similar to extends, it references code in another type
  - implementds references interfaces and extends references classes
  - The truck class references the Vehicle interface, it now has access to method signatures in the interface
- The accelerate method must match the Vehicle.accelerate signature exactly
  - It's convention to add the @override annotation to each method from the interface
  - If the accelerate method in Truc was omitted, the code wouldn't compile

## Interfaces as Types

- Interfaces are Java data types, just like classes and primitives

## When To Use An Interface

- Interfaces define a contract without implementation, creating a behavior guarantee without the need to know explicit details of the behavior
- Any class that implements the contract can be used where the interface is required

### Rule 1

    * Use an interface when there are two or more concrete implementations that solve one problem

### Rule 2

    * Use an interface when one concrete implementation solves a problem but there's a possibility of different implementations

### Rule 3

    * Use an interface to control testing
