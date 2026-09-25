/*
This question is assessing your ability to create static (inner) nested classes in Java.

Create a class named MathFunctions that contains two static nested classes.

Within the MathFunctions class:

either:

Define static nested classes called Division and Multiplication for each mathematical operation.
Each nested static class should contain a method to perform its respective operation: divide for the Division class and multiply for the Multiplication class.
Define a main method inside the MathFunctions class such that it:
has two instances of the nested classes, Division and Multiplication
calls the methods of the nested classes to perform mathematical operations

or:

Define non-static nested classes called Addition and Subtraction for each mathematical operation.
Each nested class should contain a method to perform its respective operation: add() for the Addition class and subtract() for the Subtraction class.
Define a main() method inside the MathFunctions class such that it:
has two instances of the nested classes, Addition and Subtraction
calls the methods of the nested classes to perform mathematical operations

Lastly, test your code by printing the values of the operations.

Requirements and Assumptions:

The nested class names must be Division and Multiplication.
The methods within the nested classes must be divide and multiply.
*/

public class MathFunctions {
    public static class Division {
        public float divide(int d1, int d2) {
            return (float) d1 / d2;
        }
    }

    public static class Multiplication {
        public float multiply(int d1, int d2) {
            return d1 * d2;
        }
    }

    public class Addition {
        public int add(int d1, int d2) {
            return d1 + d2;
        }
    }

    public class Subtraction {
        public int subtract(int d1, int d2) {
            return d1 - d2;
        }
    }

    public static void main(String[] args) {
//        Division division = new Division();
//        Multiplication multiplication = new Multiplication();
        MathFunctions mathFunctions = new MathFunctions();
        Addition addition = mathFunctions.new Addition();
        Subtraction subtraction = mathFunctions.new Subtraction();

        int four = 4;
        System.out.println("four: "+four);
        int two = subtraction.subtract(four, 2);
//        float two = division.divide(four, 2);
        System.out.println("two: "+two);

//        float eight = multiplication.multiply(four, 2);
        int eight = addition.add(four, four);
        System.out.println("eight: "+eight);
    }
}
