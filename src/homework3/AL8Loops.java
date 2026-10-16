package homework3;
import java.util.Scanner;
// there are first 3 tasks from those 7 tasks
public class AL8Loops {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int i, j;
    System.out.print("Enter your number: ");
    i = scanner.nextInt();
    System.out.print("Enter the target number: ");
    j = scanner.nextInt();
    // while (i<=1000) {
    //     System.out.println("'i' Before: "+i);
    //     i *= 10;
    //     System.out.println("'i' After: "+i);
    //     System.out.println("\n\n");

    // }
    for (; i<=j; i *= 10) {
        System.out.println(i);
    }
    System.out.println("Stopping, the target has reached: "+j+" < "+i*10+".");

    
    //for (;;)


    scanner.close();


    }
}
