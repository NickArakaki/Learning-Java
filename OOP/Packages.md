# Packages

- Put classes in logical groups, making them easier to navigate and locate in large projects

## Program Structure

- Methods help us organize collections of statements and expression
- Classes help us organize collections of methods and data
- Packages help organize collectioons of classes
- Packages create a unique namespace for a class when it share a name with another class

## Java Packages

- It's convention for Java packages to be organized in an Organization -> Project -> Category hierarchy
- To find a class focused on I/O we would scan down the java.io and org.apache.commons.io as possible candidate packages

## Conventions

- always lower case
- do not include punctuation
- each level is separated by a dot
- types can be added to any level of a hierarchy, but are usually not included in the most general packages
- it's best not to define classes directly in organization packages
- types make the most ssense at a category/subcategory level

## Add a Class to a Package

- To place a class in a package, add the package statement at the very top of the class definition, before any imports

```java
package org.company.project.widgets;

public class SquareWidget {

}

package company.games
import company.players.HumanPlayer;
public class TicTacToe {

}
```

- To place classes in packages, we can either
  1. Explicitely create packages (directories) and add classes to them
  2. Define a class, add thepackage statement, and let the IDE move the source file to the appropriate directory.

## Use a Class from a Different Package

- use the import keyword to import the class you want to use

```java
package learn.packages;

import learn.packages.animals.Dog;
import learn.packages.insects.Beetle;
import learn.packages.plants.Lily;

public class Farm {
    private Dog mitchell;
    private Beetle annoyingBug;
    private Lily tigerLily;

    public Farm() {
        mitchell = new Dog();
        annoyingBug = new Beetle();
        tigerLily = new Lily();
    }
}
```
