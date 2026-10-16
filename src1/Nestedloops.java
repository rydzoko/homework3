import java.util.Scanner;

public class Nestedloops {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        int rows;
        int collumns;

        String symbol = "";

        System.out.println("Enter numbers/# of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter numbers/# of collumns: ");
        collumns = scanner.nextInt();
        System.out.println("Enter symbol to fill it with: ");
        symbol = scanner.next();

        for (int i=1; i<=rows; i++) {
            System.out.println();
            for (int j=1; j<=collumns; j++) {
                System.out.print(symbol);

            }
        }
        scanner.close();
    }
}