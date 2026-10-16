import java.util.Scanner;

public class MathProgram {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x value: ");
        x = scanner.nextDouble();
        System.out.println("Enter y value: ");
        y = scanner.nextDouble();


        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: "+z);

        scanner.close();
    }

}