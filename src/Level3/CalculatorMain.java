package Level3;

abstract class Calculator {
    // Abstract methods
    abstract double add(double a, double b);
    abstract double subtract(double a, double b);
    abstract double multiply(double a, double b);
    abstract double divide(double a, double b) throws ArithmeticException;
}


class SimpleCalculator extends Calculator {

    @Override
    double add(double a, double b) {
        return a + b;
    }

    @Override
    double subtract(double a, double b) {
        return a - b;
    }

    @Override
    double multiply(double a, double b) {
        return a * b;
    }

    @Override
    double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}


public class CalculatorMain {

	public static void main(String[] args) {
        // Create an instance of SimpleCalculator
        SimpleCalculator calc = new SimpleCalculator();

        // Perform calculations
        double num1 = 10;
        double num2 = 5;

        // Add
        System.out.println("Addition: " + calc.add(num1, num2));

        // Subtract
        System.out.println("Subtraction: " + calc.subtract(num1, num2));

        // Multiply
        System.out.println("Multiplication: " + calc.multiply(num1, num2));

        // Divide
        try {
            System.out.println("Division: " + calc.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
