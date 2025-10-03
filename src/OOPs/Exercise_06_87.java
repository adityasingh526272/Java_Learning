package OOPs;


import java.util.Scanner;

        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + --> Addition
        2. - --> Subtraction
        3. * --> Multiplication
        4. / --> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the input is grater than 100000
        4. Max Multiplier reached Exception  - Don't allow any multiplication input to be greater than 7000
         */


// Custom Exceptions
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}

// Calculator Class
class CustomCalculator {
    // Common method to check for maximum input
    private void checkMaxInput(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input values should not exceed 100000");
        }
    }

    public double add(double a, double b) throws InvalidInputException, MaxInputException {
        checkMaxInput(a, b);
        // Example: Invalid input rule (if someone tries to use "&" or similar)
        if ((a == 8 && b == 9) || (a == 9 && b == 8)) {
            throw new InvalidInputException("Invalid input detected: " + a + " & " + b);
        }
        return a + b;
    }

    public double subtract(double a, double b) throws MaxInputException {
        checkMaxInput(a, b);
        return a - b;
    }

    public double multiply(double a, double b) throws MaxInputException, MaxMultiplierReachedException {
        checkMaxInput(a, b);
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplierReachedException("Multiplication inputs should not exceed 7000");
        }
        return a * b;
    }

    public double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        checkMaxInput(a, b);
        if (b == 0) {
            throw new CannotDivideByZeroException("Cannot divide by zero");
        }
        return a / b;
    }
}

// Main class to test calculator
public class Exercise_06_87{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomCalculator calc = new CustomCalculator();

        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter operator (+ - * /): ");
            char op = sc.next().charAt(0);
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = 0;
            switch (op) {
                case '+':
                    result = calc.add(a, b);
                    break;
                case '-':
                    result = calc.subtract(a, b);
                    break;
                case '*':
                    result = calc.multiply(a, b);
                    break;
                case '/':
                    result = calc.divide(a, b);
                    break;
                default:
                    System.out.println("Unknown operator!");
                    return;
            }

            System.out.println("Result = " + result);

        } catch (InvalidInputException | CannotDivideByZeroException |
                 MaxInputException | MaxMultiplierReachedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
