public class MathFunctions {
    public static class Division {
        public double divide(int d1, int d2) {
            return (double) d1 / d2;
        }
    }

    public static class Multiplication {
        public double multiply(int d1, int d2) {
            return d1 * d2;
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        Multiplication multiplication = new Multiplication();
        int four = 4;
        System.out.println("four: "+four);
        double two = division.divide(four, 2);
        System.out.println("two: "+two);
        double eight = multiplication.multiply(four, 2);
        System.out.println("eight: "+eight);
    }
}
