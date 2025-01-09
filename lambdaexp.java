public class lambdaexp {

    // Defining a functional interface with a single abstract method
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);  // Abstract method for mathematical operation
    }

    public static void main(String[] args) {

        // Using lambda expression for Addition
        MathOperation addition = (a, b) -> a + b;

        // Using lambda expression for Subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Using lambda expression for Multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Using lambda expression for Division
        MathOperation division = (a, b) -> a / b;

        // Performing operations
        int num1 = 10, num2 = 5;
        System.out.println("Addition: " + performOperation(num1, num2, addition));
        System.out.println("Subtraction: " + performOperation(num1, num2, subtraction));
        System.out.println("Multiplication: " + performOperation(num1, num2, multiplication));
        System.out.println("Division: " + performOperation(num1, num2, division));
    }

    // Method that takes a MathOperation and performs the operation
    public static int performOperation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);  // Invoking the method of the lambda expression
    }
}
