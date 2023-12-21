
abstract class Calculator {
    // Abstract methods
    public abstract double add(double num1, double num2);
    public abstract double subtract(double num1, double num2);
    public abstract double multiply(double num1, double num2);
    public abstract double divide(double num1, double num2);
}

// Concrete subclass
class BasicCalculator extends Calculator {
    // Implementing abstract methods
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // NaN (Not a Number) represents an undefined result
        }
    }
}

// Main class to test the calculator
public class Main {
    public static void main(String[] args) {
        // Create an object of the child class
        BasicCalculator calculator = new BasicCalculator();

        // Test the calculator methods
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
        System.out.println("Division by zero: " + calculator.divide(5, 0));
    }
}