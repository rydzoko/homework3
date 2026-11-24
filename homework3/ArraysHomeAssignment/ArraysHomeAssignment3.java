package ArraysHomeAssignment;

import java.util.Scanner;

public class ArraysHomeAssignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] userRem = {10,20,30,40,50};


        System.out.println("Array: ");
        for (int num : userRem) {
            System.out.print(num+" ");
        }
        int userInd;
        System.out.println("\nWhich index to remove: ");
        userInd = sc.nextInt();

        if (userInd<0 || userInd>userRem.length) {
            System.out.println("\nA non-possible value was entered");
            sc.close();
            System.exit(0);
        }

        System.out.println("Updated: ");
        for (int i = 0; i < userRem.length; i++) {
            if (userRem[userInd]==userRem[i]) {
                continue;
            } else {
                System.out.print(userRem[i]+" ");
            }
        }

    }   
}
