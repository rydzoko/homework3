import java.util.Scanner;

public class AL11PINV1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inpPIN = 0;
    int corrPIN = 1234;
    int att = 3;
    

    for (;inpPIN != corrPIN && att>0;) {
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
        System.out.println("What,,,");
    }
    
    scanner.close();
    }
    
}
