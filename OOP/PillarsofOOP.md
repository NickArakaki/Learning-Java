# 4 Pillars of OOP

1. Encapsulation

- Distilling a concept down to a discrete set of data and behaviors
- Encapsulation creates a new data type that's easy to understand and use
- If a class does too many things, its encapsulation is poor

2. Inheritance

- When one type extends another type
- th enew type gains access to all the non-private fields and methods of its superclass without having to rewrite them

3. Polymorphism

- When one or mor sublcasses oerride a super-class method or implement an interface
- All types have the same method signature, but the outcome differs between types

4. Abstraction

- The principle of revealing only the essential characteristic of a type
- Good abstraction makes complicated data types easy to use
- Allows us to interact with complex systems or classes using simplified interfaces
- Work with a high-level concept that hides the complexities underneath

## SOLID

- Represents a set of design principles for improving Object Oriented Code

1. Single Responsibility Principle (SRP)
   - Each class should have one and only one responsibility and that responsibility should not appear in more than one class
2. Open-close Principle
   - A class should be open for extension but closed for modification
   - If additional responsibilities are required, they should be added to a class that uses the original class
3. Liskov Substitution Principle
   - If a super-class is required, any subclass of that type should satisfy the requirement without inspecting the sub class
   - All subclasses should serve as suitable replacements for the required type
4. Interface Segregation Principle
   - Prefer to use many small, specific interfaces instead of one large, general interface
5. Dependency Inversion Principle
   - Classes should rely on abstractions, not implementations
   - It's better to provide a super-class or interfaces as a class dependency
   - offers flexibility since anyy subclass can be swapped for another

## DRY

- repeated operation should be refactored into methods
- repeated responsibilities should be refactored into clear classes

## YAGNI

- avoid writing code that might b useful in the future, only write cod that solves an immediate problem
- don't create complex code unless it's the only way to solve a problem
