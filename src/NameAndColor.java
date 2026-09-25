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
