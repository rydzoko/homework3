import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        String[] myHobbies = new String[3];
        myHobbies[0] = "Running";
        myHobbies[1] = "Studying";
        myHobbies[2] = "Reading";


        System.out.println("The loop is running! Computer is waiting for your response...");
            System.out.print("You are free to type anything, or just end the loop by 'exit': ");

        while (!input.equalsIgnoreCase("exit")) {

            input = scanner.nextLine();

            System.out.println("What you typed: " + "\n" + input);

            if (input.equalsIgnoreCase("exit"))
                System.out.println("Your're leaving already? Well, Goodbye then!");
        }

        System.out.println("The loop was ended by user (You), thanks for testing!");
        scanner.close();
    }
}
