import java.util.Scanner;

public class AL4CalculatorV2Switches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;

        char operator;

        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter the operation (*, /, -, +): ");

        operator = scanner.next().charAt(0); 

        switch (operator) {
            case '+' -> System.out.println("Result: "+(num1 + num2)); 
            case '-' -> System.out.println("Result: "+(num1 - num2));
            case '*' -> System.out.println("Result: "+(num1 * num2));
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Error: Do not divide by zero! Idiot.");
                } else {
                    System.out.print("\nResult: "+(num1/num2));

                }
            }

            default -> System.out.println("Invalid operator. Please restart and choose the appropitate one.");
            
        };




        scanner.close();
    }

}