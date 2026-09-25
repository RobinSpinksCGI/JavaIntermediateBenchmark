// Core JUnit framework, do not remove.
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

// For assertions in tests, do not remove.
import static org.junit.Assert.*;

// Used for capturing console output, used in `setUpStreams` and `restoreStreams`.
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.io.InputStream;

// For checking the existence of methods, used in `testMethodExistence` and `testMethodExistenceAndInvocation`
import java.lang.reflect.Method;

// For checking type, used in `testMethodReturnType`
import java.lang.reflect.Type;

// For reading and testing regex in code file, used in `readCode`.
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// For testing regex patterns, used in `testRegexPatterns` and `testRegexPatternInLearnerCode`
import java.util.regex.Pattern;
import java.util.regex.Matcher;

// For formatting fail message, used in `assertEqualsWithMessage`
import java.util.Objects;

// Note: Test class *HAS* to be named `LETest`. A `LETest.java` file will appear in workspace.
public class TestNameAndColor {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final InputStream originalIn = System.in;
    private final String input = "John\nred";

    private NameAndColor classInstance;

    // Helper method for formatting messages to learners, make sure to cast output types to String (toString()) if they're not inherently strings. Use as necessary to modify error message, sometimes you won't need it.
    public static <T> void assertEqualsWithMessage(String message, T expected, T actual) {
        assertTrue(message, Objects.equals(expected, actual));
    }

    // Helper function to read code file
    private String readCode(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            fail("Failed to read file. " + e.getMessage());
            return "";
        }
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Initialize the learner's class instance here if applicable (using object-based tests)
        classInstance = new NameAndColor();
    }
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(originalIn);
    }


    // Tests method returning some value.



    // The following are class-based tests, use to test things about the class or static methods. If you're testing instance methods, use the object-based tests above.

    // Combined test that checks for 1. class to exist, 2. class to have proper attributes, 3. class has constructor 4. class has a specific method. Delete portions as necessary.
    @Test
    public void testClassAttributesAndMethodExistence() {
        try {
            Class<?> nameAndColorClass = Class.forName("NameAndColor");

        } catch (ClassNotFoundException e) {
            fail("Expected the `NameAndColor` class to exist.");
        }
    }

    @Test
    public void testRegexPatternInLearnerCode() {
        // Usually, the path to the file is just "FileName.java" since test file is colocated in the same directory.
        String sourceCode = readCode("src/NameAndColor.java");
        String regex = "scanner.nextLine";

        // Compile regex into a Pattern object
        Pattern pattern = Pattern.compile(regex);
        // Then perform a match operation using the Pattern
        Matcher matcher = pattern.matcher(sourceCode);

        assertTrue("Expected use of `scanner.nextLine()`", matcher.find());
    }

    @Test
    public void testClassConsoleOutput() {
        String[] expectedStrings = {
                "John",
                "red"
        };
        try {
            Class<?> nameAndColorClass = Class.forName("NameAndColor");
        } catch (ClassNotFoundException e) {
            fail("Expected `NameAndColor` class to exist.");
        }
        NameAndColor.main(new String[]{});
        String output = outContent.toString();
        for (String expected : expectedStrings) {
            String regexPattern = ".*" + Pattern.quote(expected) + ".*";
            Pattern pattern = Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            Matcher matcher = pattern.matcher(output);
            assertTrue(String.format("Expected console output to contain: \"%s\"", expected), matcher.find());
        }

    }
}