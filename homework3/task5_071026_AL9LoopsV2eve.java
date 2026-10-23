
//Practice session 07.10.2026, 5th task
//printing all even number up until the input number placed by user

import java.util.Scanner;
public class task5_071026_AL9LoopsV2eve {
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