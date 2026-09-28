/*
This question is assessing your ability to write tests using JUnit in Java.

Create accompanying methods in the ArrayProcessorTest class, which will be used for testing the provided ArrayProcessor class.

Write a setUp() method such that:

It runs before each test method.
It creates a new instance of ArrayProcessor.
Write a tearDown() method such that:

It runs after each test method.
It sets ArrayProcessor to null.
Requirements and Assumptions:

The ArrayProcessor class and its implementation have already been provided in a separate file.
*/

//ArrayProcessor.java
public class ArrayProcessor {
    public int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
