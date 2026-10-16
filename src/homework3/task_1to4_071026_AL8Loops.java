//PRACTICE SESSION 07.10.2026
//1 to 4 tasks

package homework3;
import java.util.Scanner;
// there are first 3 tasks from those 7 tasks
public class task_1to4_071026_AL8Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j;
    //task- 1, this as written in the task itself, is going to loop, 
    //and at every cycle, the number 10 will be multiplied by 10
    // while (i<=1000) {
    //     System.out.println("'i' Before: "+i);
    //     i *= 10;
    //     System.out.println("'i' After: "+i);
    //     System.out.println("\n\n");

    //task- 2, the same funcionality, but there 'for' is used
    // for (;i<=1000;i *= 10) {
    //     System.out.println("'i' Before: "+i);
        
    //     System.out.println("'i' After: "+i);
    //     System.out.println("\n\n");


    

    //task-3, here i put an input ability not only for the target number, but also for what number it's gonna be increased at every cycle  
    System.out.print("Enter your number: ");
    i = scanner.nextInt();
    System.out.print("Enter the target number: ");
    j = scanner.nextInt();
    
    
    for (; i<=j; i *= 10) {
        System.out.println(i);
    }
    System.out.println("Stopping, the target has reached: "+j+" < "+i*10+".");

    //task-4, it's gonna run forever, since there is no variable++ (no updater), nor it has conditions(no conditions, mean it will always be true ) or "break;"
    //for (;;)


    scanner.close();


    }
}
