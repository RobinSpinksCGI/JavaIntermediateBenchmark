// Your package imports here:

import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        // Your code below:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int int1 = Integer.parseInt(scanner.next());
        System.out.print("Enter the second integer: ");
        int int2 = Integer.parseInt(scanner.next());
        System.out.println("The sum of "+int1+" and "+int2+" is: "+(int1+int2));
    }
}
