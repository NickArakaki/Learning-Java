# Inheritance

## Is-a and has-a

- A Java class can inherit members form another Java class by using the extends keyword
- All fields, constructors, and methods become part of the child, except for members marked private
- an is-a relationship means that Concept B is some version of Concept-A, the more specific concept would inherit from the less specific concept
- a has-a relationship defines a connection between two concepts where Concept B uses concept A as an independent extension of itself
- Inheritance isn't appropriate in a has-a relationships

## Access Modifiers

- public
  - accessible from anywhere, including other classes, other packages, and even outside your program
- protected
  - accessible within the same class, subclasses (classes that inherit from this class), and within the same package
- default (aka package-private)
  - accessible within the same package but not from outside the package
- private
  - only accessible within the same class, can't be accessed form sublcasses, other classes, or other packages

## Inheritance Relationships

- the inheriting class is always the child
- a sublcass acess members in a superclass uing the super keyword

### Example: Person, Student, Instructor

- Both students and instructors are people, both have an is-a relationship to the general concept of a person
- A student and instructor are people with more details
  - Student has studentId
  - Instructor has employeeId and title

```java
    // Person.java
    public class Person {
        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFullName() {
            return String.format("%s %s", firstName, lastName);
        }
    }

    // Student.java
    public class Student extends Person {
        private String studentId;

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public Student(String firstName, String lastName, String studentId) {
            super(firstName, lastName);
            this.studentId = studentId;
        }

        @override
        public String getFullName() {
            String personFullName = super.getFullName();
            return String.format("%s, ID: %s", personFullName, studentId);
        }
    }

    // Instructor.java
    public class Instructor extends Person {
        private String employeeId;
        private String title;

        public String getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Instructor(String firstName, String lastName, String employeeId, String title) {
            super(firstName, lastName);
            this.employeeId = employeeId;
            this.title = title;
        }

        @override
        public String getFullName() {
            String personFullName = super.getFullName();
            return String.format("%s:, ID: %s, Title: %s", personFullName, employeeId, title);
        }
    }
```

## Ploymorphism

- subclasses can completely replace a parent method, this is called overriding a method
- to acknowledge the override (not required), add the @override annotation to the declaration, makes it clear that we intend to replace the parent method that it's not an accident
- Polymorphism is when an object of one type executes a method and an object of a different type executes the same method (or at least the samem signature) and its behavior is different
- The new method must be identical to the parent's, it must have the same name, parameters, and return type

## Inheritance vs Composition

- In Java we can only exted a single class, there's no way to create a class that extends multiple parent classes

### Composition

- Composition is a way to model realtionships by including complex types as fields in other types

```java
// Student.java
public class Student {
    private String studentId;

    public String getStudentId(){
        return studentId;
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }
}

// Instructor.java
public class Instructor {
    private String employeeId;
    private String title;

    public String getEmployeeId() {
        return employeeId;
    }

    public String getTitle() {
        return title;
    }

    public Instructor(String employeeId, String title) {
        this.employeeId = employeeId;
        this.title = title;
    }
}

// Person.java
public class Person {
    private String firstName;
    private String lastName;

    private Student studentRecord;
    private Instructor instructorRecord;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student getStudentRecord() {
        return studentRecord;
    }

    public void setStudentRecord(Student studentRecord) {
        this.studentRecord = studentRecord;
    }

    public Instructor getInstructorRecord() {
        returh instructorRecord;
    }

    public void setInstructorRecord(Instructor instructorRecord) {
        this.instructorRecord = instructorRecord;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        StringBuilder buffer = newStringBuilder(100);

        if (instructorRecord != null) {
            buffer.append(instructorRecord.getTitle());
            buffer.append(" ");
        }

        buffer.append(firstName);
        buffer.append(" ");
        buffer.append(lastName);

        if (studentRecord != null) {
            buffer.append(", ID: ");
            buffer.append(studentRecord.getStudentId());
        }

        return buffer.toString();
    }
}
```

## Another Rule-of-Thumb

- Avoid inheritance when modeling the real world
- Inheritance is bettersuidted for technical concepts

### Object

- In Java, all classes inherit form the Ojbect class implicitely
- The members are methods that are commonly required for all classes
  1. toString
     - Returns a String representation fo an object
     - Default: class name and hex representation of the hasCode
  2. hasCode
     - Returns an int code that's used for storing an object in hashed data structures
  3. getClass
     - Returns the class associated with the objec
     - An instance of a Class contains metadata (names, parameter, annotation) associated with a class
  4. Equals
     - Returns a boolean that indicates if this instance is equal to another.
     - Default evaulates to true if the objecs share the same meory location, called reference equality
     - Commonly overrided to inspect individual vlaues instead of comparing references
