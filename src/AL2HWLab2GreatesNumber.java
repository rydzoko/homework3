import java.util.Scanner;

public class AL2HWLab2GreatesNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1, num2, num3;


        System.out.print("Enter the first number: ");
        num1 = scanner.nextFloat();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextFloat();
        System.out.print("Enter the third number: ");
        num3 = scanner.nextFloat();
        System.out.println("Checking...");

        if (num1>num2 &&  num1 > num3) {
            System.out.println("The greatest number is: "+ num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is: "+ num2);
        } else {
            System.out.println("The greatest number is: "+ num3);
        }

        scanner.close();







    }
    
}
