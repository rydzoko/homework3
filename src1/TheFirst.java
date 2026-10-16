import java.util.Scanner;

public class TheFirst {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Asking questions, to store them 
        System.out.println("Hey, what's your name?:");
        String name = scanner.nextLine();
        //Asking about age.
        System.out.println("About your age?:");
        int age = scanner.nextInt();
        //Clears the "Enter" key press from memory
        scanner.nextLine();

        System.out.print("And your major?:");
        String major = scanner.nextLine();

        System.out.println("\n--- Here is what I learned about you ---");
        System.out.println("Hi! it's pleasure to meet you, " + name + "!");

        if (age >= 21) {
            System.out.println("Whoa! You're already officially an adult!");
        } else if (age >= 18) {
            System.out.println("You seem to be an adult in your country, just under 21.");
        } else {
            System.out.println("Okay, You're still having a lot of time dealing with your path!");
        }

        if (major.equalsIgnoreCase("computer science")) {
            System.out.println("Wait, you are studying CS? Me too!");
        }

        System.out.println("Let's see, so your age is " + age + "? Got it. And about your majority, " + major + " is a great choice!");

        System.out.println("Since, you can see these messages, you're doing great so far, keep going!");
        
        scanner.close();
    }
}