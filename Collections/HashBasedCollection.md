# Hash-Based Collections

## Data Structures
* a storage format, either in-memory or on a disk, coupled with operations tha support efficient manipulation of the stored data.
* A data structure is a data type, but not all data types are data structures

### Common Data Structures
* List
    * An ordered sequence of elements
    * Accessed by index or position
* Hash Table/Hash Map
    * Elements may be ordered or unordered
    * Elements are accessed using a key that "maps" to a value
* Queue
    * An ordered sequence of elements
    * Elements are processed in a FIFO fashion
* Stack
    * An ordered sequence of elements
    * Elements are processed in a LIFO fashion
* Set
    * An unordered collection of unique elements
* Graph
    * An unordered collection of elements that are linked or connected
    * The structure can vary
* Tree
    * An unordered collection of elements taht are linked or connected
    * The structure of the connections is a hierarchy
    * All elements have a parent, execpt for the root element

### HashMap
* General purpose map implementation from the Java Collections Framework
* unordered collection
#### Mapping
* to define a one-to-one correspondence between one value and another
* Keys and values can be any type
#### Hashing
* Any data type may be used as a key as long as it points to one and only one value
* All objects include a .hashCode method which returns their integre hash value
#### Creating a HashMap
```java
import java.util.HashMap;

HashMap<Integer, Character> numberToLetter = new HashMap<>();

numberToLetter.put(1, 'A');
numberToLetter.get(1); // 'A'
```
* Looping
    * .values
    * .keySet
    * .entrySet
        * returns a set of entries bound to this instance's key and value types
```java
HashMap<String, Login> emailToLogin = new HashMap<>();
emailToLogin.put("cspacey0@myspace.com", new Login("cspacey0@myspace.com", "Carita", "Spacey"));
emailToLogin.put("sbretherick1@va.gov", new Login("sbretherick1@va.gov", "Sammy", "Bretherick"));
emailToLogin.put("zcripwell2@dot.gov", new Login("zcripwell2@dot.gov", "Zia", "Cripwell"));
emailToLogin.put("spyatt3@marketwatch.com", new Login("spyatt3@marketwatch.com", "Sianna", "Pyatt"));
emailToLogin.put("oranahan4@bing.com", new Login("oranahan4@bing.com", "Odelinda", "Ranahan"));

for(Login l: emailToLogin.values()) {
    l.getFirstName();
    l.getLastName();
    // Carita Spacey
    // Odelinda Ranahan
    // Sianna Pyatt
    // Sammy Bretherick
    // Zia Cripwell
}

for (String key: emailToLogin.keySet()) {
    Login l = emailToLogin.get(key);
    l.getFirstName();
    l.getLastName();
// Carita Spacey
// Odelinda Ranahan
// Sianna Pyatt
// Sammy Bretherick
// Zia Cripwell
}

for(Entry<String, Login> entry: emailToLogin.entrySet()) {
    entry.getKey();
    entry.getValue().getFirstName();
    entry.getValue().getLastName();
}
```

## Collisions
* if .put is called twice with the same key, the original value associated to the key will be replaced

## Removing Values
* remove a value using its key with the remove method
* if a key isn't mapped to a value, the .remove method has not effect

## Other Methods
* size
    * returns the number of values in the map
* containsKey
    * returns true of a key is present in the map, false if there isn't


## HashSet
* A data structure that doesn't allow duplicates
```java
HashSet<Integer> uniqueNums = new HashSet<>();
```