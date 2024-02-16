package oops;

public class methodOverloading {
    public static void main(String[] args) {
        int a = 10, b = 5;
        double c = 2.5, d = 1.5;

        System.out.println("Addition of two integers: " + add(a, b));
        System.out.println("Addition of two doubles: " + add(c, d));
        System.out.println("Multiplication of two integers: " + multiply(a, b));
        System.out.println("Multiplication of two doubles: " + multiply(c, d));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}
