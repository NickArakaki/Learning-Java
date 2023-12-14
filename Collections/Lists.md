# Lists
* The ArrayList\<E> is part of the Java Collections Framework
* A collection is a data type designed for managing many objects
* The ArrayList is the most general and flexible collection 

## ArrayLost
* lives in the java.util package
* an array-like collection and it's also a list
* a list has the following properties:
    * can store many elements
    * Elements are ordered sequentially
    * Elements can are accessed by index, starting at 0
    * Has operations for adding, removing, and accessing elements
    * When an element is removed, all elements after it 'shift' to one index smaller

## Generic Types
* A generic type is a type that accepts a dependent type tha tcan very
* The letter E is a placeholder, standing for element
* When a generic class is declared and instantiated, the E is repalced with the class name
```java
import java.utils.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
    }
}
```

## Instantiation
* Once instantiated, an ArrayList can only store elements of that type

## Creating an ArrayList<E>
* ArrayLists have 3 constructors
```java
// create an ArrayList with default capacity
ArrayList<SoccerPlayer> one = new ArrayList<SoccerPlayer>();

// create an ArrayList with an explicit capacity
ArrayList<SoccerPlayer> two = new ArrayList<SoccerPlayer>(23);

// create an ArrayList based on another collection
ArrayList<SoccerPlayer> three = new ArrayList<SoccerPlayer>(two);
```
* All generic types, including ArrayLists, can only track reference types
* If we need to store primitive types, use the primititve's wrapper class
```java
ArrayList<Integer> integers = new ArrayList<Integer>();

ArrayList<Double> doubles = new ArrayList<Double>();
```
* we can omit the dependent type during instantiation and replace it with the diamond operator \<>
* The compiler infers the type from the left side of the assignment statement

## Adding Elements
* add
    * use the .add method to add one element at a time, appending the element to the end of the list
    * it can also insret an element at a specific index
```java
    ArrayList<SoccerPlayer> goalKeeprs = new ArrayList<>();

    SoccerPlayer franch = new SoccerPlayer();
    goalKeepers.add(0, franch);
```
    * Be careful with index insertion, if the index is negative or greater than one more than the last idnex, the operation will fail with a run-time error

* addAll
    * appends elements from a collection to the end of the list
    * can also add elements at a specific index

## Initialize with Data
```java
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ArrayList<SoccerPlayer> defense = new ArrayList<>(Arrays.asList(
            new SoccerPlayer(),
            new SoccerPlayer(),
            new SoccerPlayer()
        ))
    }
}
``` 

## Accessing Elements
* get
    * to acces individual elements, use the .get method
    * a negative index or an index tha tis too large will cause a run-time error

* size
    * will return the number of elements currently in the list

## Removing Elements
* remove method to remove elemtnes from the list
### Remove by Index
* removes the element and returns it
```java
ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));

int numRemoved = nums.remove(3); // 4
// nums = [1,2,3,5]

```
### Remove by Value
* accepts a value and returns nothing
* value to remove must be the same type as the ArrayList's tracked type
* Removes the first element that is equal to the value