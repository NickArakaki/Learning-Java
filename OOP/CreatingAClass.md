# Creating a Class

## Class Syntax

- Each public class must go in its own source file

```java
// App.java
public class App {
    public static void main(String[] args) {
        NationalForest one = new NationalForest();
        one.name = "Allegheny";

        NationalForest two = new NationalForest();
        two.name = "Angeles";

        NationalForest three = new NationalForest();
        three.name = "Angelina";

        System.out.println(one.toLine());
        System.out.println(two.toLine());
        System.out.println(three.toLine());

        /**
            name: Allegheny, location: null, acres: 0
            name: Angeles, location: null, acres: 0
            name: Angelina, location: null, acres: 0
        */
    }
}

// NationalForest.java
public class NationalForest {
    private String name;
    private String location;
    private int acres;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getAcres() {
        return acres;
    }

    public void setAcres(int acres) {
        if (acres > 0) {
            this.acres = acres;
        }
    }

    public NationalForest(String name, String location, int acres) {
        this.name = name;
        this.location = location;
        this.acres = acres;
    }

    public int getSquareKilometers() {
        retrun (int) (this.acres / 247.1);
    }

    public String.toLine() {
        return String.format("name: %s, location: %s, acres: %s, km^2: %s", name, location, acres, getSquareKilometers());
    }
}
```

- Only 3 things area llowed inside the class's code block
  1. class-level variables (aka fields)
     - declared with an optional access modifier
     - may be accessed from methods outside the class using the . operator
     - do not require assignment before they can be used, a field without an assignment has its type's default value
  2. Mehtod definitions
     - all methods must be defined inside a data type, definition outside of a type is not allowed
  3. Constructors
     - Method-like code that initializes an individual object

* The this keyword accesses class members, a member is any field or method decalred inside the class code block.

## Constructors

- a method-like subroutine that ensures an object is created in a valid state
- Syntax:
  - a constructor does not have a return data type, it creates an object so no return type is required
  - a constructor's name must match its class name exactly, no exceptions
  - may have an access modifier
  - can accept zero or more parameters, just like a method

## The new Operator and Constructors

- the new operator always executes a construcotr
- if a class doesn't include a constructor, the complier adds one
- It is possible, and sometimes desirable to add more than one constructor
- Constructors can be overloaded like methods, only each constuctor must have a unique combination of parameters
- Constructors can call other constructors by using the this keyword

```java
public class NationalForest {
    public String name;
    public String location;
    public int acres;

    public NationalForest() {
        this("unknown", "unknown", -1);
    }

    public NationalForest(String name) {
        this(name, "unknown", -1);
    }

    public NationalForest(String name, int acres) {
        this(name, "unknown", acres);
    }

    public NationalForest(String name, String location, int acres) {
        this.name = name;
        this.location = location;
        this.acres = acres;
    }
}
```

## Methods and Classes

- non-static methods have access to fields, static methods don't
- static methods are independent methods with no context, defined in a class, but not part of an individual object
- non-static methods can't be executed independently, they're part of an object, they have access ot an object's state
- non-static methods are executed using an instance of an object, static methods are executed using a class name

## Access Modifiers, Getters and Setters

- it's typically considered bad form to allow someone outside of the class to directly access fields

### Access modifiers

- all definitions inside a class can be modified with the following keywords to adjust how the outside world interacts with them
  1. public
     - all classes can access the member
  2. protected
     - only classes in the same package or a subclass can access the member
  3. private
     - the member is only visible from inside the class ocntaining the definition. No outside classes may access it
- optional, if omitted classes in the same package can access the member, but a subclass cannot
- strongly recommended to always include access modifieres to that the intention is explicit.

### Getters and Setters

- general rule, fields should start private, even when there's no clear way to put them in an invalid state.
- to access a field for reading and writing, it's Java convention to add getter and setter methods
  - Getter returns the value of a field, and by cnvention is named after the the field prefixed by the verb get
  - Setter accepts a value fo teh same data type as the field and assigns it to the field if it's valid, and by convention it's named after the field prefixed by the verb set
