

import java.util.Scanner;

public class NumberPatternGenerator {
    public static void generator(int size, int opt) {
        switch (opt) {
            case 1: // Right Triangle
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(); // moves to next line
                }
                break;
                
            case 2: //Inverted Right Triangle
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                
            case 3: //pyramido
                for (int i = 1; i <= size; i++) {
                    // print empty spaces first to push stars to center
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print(" ");
                    }
                    // formula for odd numbers of stars: 1, 3, 5, 7...
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                
            case 4: //inverted Pyramid
                for (int i = size; i >= 1; i--) {
                    // spaces increase as we go down
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                
            case 5: //simple Square pattern as example 5
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                
            default:
                System.out.println("Invalid operator, choose from 1-5");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int rows = sc.nextInt();

        System.out.println("1 - Right Triangle\n2 - Inverted Triangle\n3 - Pyramid\n4 - Inverted Pyramid\n5 - Square");
        System.out.print("Choose pattern: ");
        int choice = sc.nextInt();


        System.out.println();
        generator(rows, choice);
        sc.close();
    }
}
