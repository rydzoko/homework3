import java.util.Scanner;

public class AL9LoopsV2eve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.println("Select your number: ");
        n = scanner.nextInt();

        while (n>1) {
            if (n%2 == 1) {
                n -=1;
            } else if (n%2 == 0) {
                n -= 2;
            }

        System.out.println(n);
        }


        scanner.close();
    }
}