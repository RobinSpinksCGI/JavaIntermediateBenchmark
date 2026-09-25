/*
This question is assessing your ability to develop a program that accepts user inputs and provides outputs in Java.

First, import the necessary packages needed to allow the application to prompt for inputs.

Next, complete the main method within the NameAndColor() class such that it:

prompts the user to enter their name and stores the result in a variable
prompts the user to enter their favorite color and stores the result in a variable
prints out a message that includes the name and color variables
For example:

What is your name? Jamie
What is your favorite color? Blue
Name: Code
Color: Blue

Copy to Clipboard

Requirements and Assumptions:

To see the output in the terminal, run the command: java NameAndColor.
When prompting for a name and color, strings must be printed to specify the value being asked, such as "What is your name?".
*/

// Import your packages here:
import java.util.Scanner;

public class NameAndColor {

    public static void main(String[] args) {
        // Your code below:
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.next();
        System.out.print("What is your favorite color? ");
        String color = scanner.next();
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
    }
}
