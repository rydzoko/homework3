import java.util.Random;
import java.util.Scanner;

public class AL12GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNum = rand.nextInt(11);
        int inpNum, att = 5, count = 0;

        System.out.println("======Welcome to our Java number guessing game!======");
        System.out.println("Before we start, let me quickly pick up a number...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Okay, I got it!\nNow, Try to guess it: ");
        inpNum = scanner.nextInt();

        for (; inpNum != randomNum && att > 0;) {
            if (inpNum > randomNum) {
                System.out.println("Too high!");
                att -= 1;
                count += 1;
            } else if (inpNum < randomNum) {
                System.out.println("Too low!");
                att -= 1;
                count += 1;
            }

            System.out.println("\nTry again: ");
            inpNum = scanner.nextInt();
        }
        
        if (!(att > 0 )) {
            System.out.println("\nGame over!\nUnfortunately, you weren't able to guess my number.\nIt was: "+randomNum+"\nAttempt count: "+count);
        } else if (inpNum == randomNum) {
            System.out.println("\nSpotted on!\nYour guess was correct!\nYou finished in "+count+" attempts.");
        }


        scanner.close();
        

    }   
    
}
