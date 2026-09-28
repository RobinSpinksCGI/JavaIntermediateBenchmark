/*
This question is assessing your ability to match patterns using regular expressions in Java.

A public class named EmailValidator has been provided; complete it such that:

It has one private static field called emailRegex. You must set this to a string representing the regular expression pattern for validating email addresses.
It has one private static field called pattern. You must set this to match email addresses against your regular expression pattern.
The isValidEmail() method returns a boolean value indicating whether the input string is a valid email address according to the defined regular expression pattern.
Refer to the following table for valid and invalid email addresses:

Email	Expected Result
example@example.com	true
test.email@example.com	true
test-email@.co	false
mock@example-domain	false
code.cademy@company.io	true
Requirements and Assumptions:

You must import the necessary libraries.
A portion of the EmailValidator class has already been provided.
The main method and some test email addresses have been provided. You may use it to test your isValidEmail() method logic.
*/

// Your imports here:

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    // Your code below:
    private static String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    private static Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);

    public static boolean isValidEmail(String email) {
        // Implement this method:
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args) {
        String[] emails = {
                "example@example.com",
                "test.email@example.com",
                "test-email@example.co.uk",
                "user123@example-domain.com",
                "invalid_email.com",
                "invalid-email@example.",
                "invalid-email@.com"
        };

        for (String email : emails) {
            System.out.println(email + " is valid? " + isValidEmail(email));
        }
    }
}
