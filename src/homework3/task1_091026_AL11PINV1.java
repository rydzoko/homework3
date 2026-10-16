//practice session, atm pin verification, task 1st, it covers both situations when
// a user gets the pin correct or wrong, well, it was meant to act like so already in the first place though
package homework3;
import java.util.Scanner;

public class task1_091026_AL11PINV1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inpPIN = 0;
    int corrPIN = 1234;
    int att = 3;
    

    for (;inpPIN != corrPIN && att>0;) {
        System.out.println("Hello, you should ");
        System.out.print("\nEnter your PIN: ");
        inpPIN = scanner.nextInt();

        if (inpPIN != corrPIN) {
            System.out.println("Incorrect, please try again.");
            att -=1;
            System.out.println("Remaining attemts: "+att);
        }
        }

    if (inpPIN == corrPIN) {
        System.out.println("\nAccess granted!");
    } else if (!(att > 0)) {
        System.out.println("\nCard blocked.");
        scanner.close();
        System.exit(0);
    } else {
        System.out.println("Oopsie, something has gone wrong, restart the program.");
        scanner.close();
        System.exit(0);
        
        }   
    
    scanner.close();
    }
    
}
