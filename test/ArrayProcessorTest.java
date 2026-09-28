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

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ArrayProcessorTest {
    private ArrayProcessor arrayProcessor;

    // Write your code below


    @Test
    public void testFindMaxWithPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        int max = arrayProcessor.findMax(array);
        assertThat(max, equalTo(5));
    }

    @Test
    public void testFindMaxWithNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        int max = arrayProcessor.findMax(array);
        assertThat(max, equalTo(-1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyArray() {
        int[] array = {};
        arrayProcessor.findMax(array);
    }
    public ArrayProcessor getArrayProcessor() {
        return arrayProcessor;
    }
}

