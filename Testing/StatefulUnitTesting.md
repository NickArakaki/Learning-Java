# Stateful Unit Testing
* a pure function is a function where a given input always produces the same value
* instance methods can vary depending on an object's state

## Arrange, Act, Assert
### Arrange
* prepare the object to be tested
* if it requires specific data, provide it
* if it requires internal objects, provide them

### Act
* Execute the method to be tested
* we may not caputre the method's return value, instead we may execute the method and then confirm the object is in the correct state

### Assert 
* Confirm that the value returned or the state of the object matches what is expected

## Notes
* Unit tests are not guaranteed to run in order, so don't create dependencies between tests
