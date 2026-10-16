import java.util.Scanner;

public class AL3HWLab2AbilityToVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userAge;

        System.out.println("We're about to check if you'are able to vote.");
        System.out.println("So, firstly, What's your age?: ");
        userAge = scanner.nextInt();

        if (userAge>=18) {
            System.out.println("You're able to vote!");
        } else if (userAge<18 && userAge>0) {
            System.out.println("You're not yet able to vote, fortunately.");
        } else {
            System.out.println("Maybe you should wait until you get born");
        }

        scanner.close();
        
    }
}