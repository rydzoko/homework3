import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        
        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter the operation (*, /, -, +): ");

        char a = scanner.next().charAt(0);

        scanner.nextLine();
        


        if (a=='*') {
            System.out.print("Answer: ");
            System.out.print(num1*num2);
        } else if (a=='/' && num2==0) {
            System.out.print("\nError, do NOT divide by zero (idiot).");
        } else if (a=='/') {
            System.out.print("Answer: ");
            System.out.print(num1/num2);
        } else if (a=='-') {
            System.out.print("Answer: ");
            System.out.print(num1-num2);
        } else if (a=='+') {
            System.out.print("Answer: ");
            System.out.print(num1+num2); 
        } else {
            System.out.println("Error, invalid option (please restart and try again with promted operations above.)");
        }

        scanner.close();



    }
}