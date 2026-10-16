import java.util.Scanner;

public class AL4HWLab2ODDOrEVEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        System.out.println("Let's check your number for being odd or even!");

        num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("EVEN: Your number seems to be divisible by 2, thus it's even!");
        } else {
        System.out.println("ODD: Your number cannot be divided by two without a remainder, it's odd!");
        }
        scanner.close();
    }
    
}
