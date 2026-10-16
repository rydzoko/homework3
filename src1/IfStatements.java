import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your age: ");
        int age = scanner.nextInt();

        if(age>=50) {
            System.out.println("Ok big boy!");
        } else if(age>=18) {
            System.out.println("You are an adult!");
        } else if(age>=13) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not an adult!");
        }

        scanner.close();

    }
}