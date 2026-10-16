import java.util.Scanner;

public class AL1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        int students;
        int rooms;

        System.out.println("How many students: ");
        students = scanner.nextInt();
        System.out.println("How many rooms:");
        rooms = scanner.nextInt();


        if(rooms !=0 && students/rooms > 30) {
            System.out.println("Crowded");
        } else if (rooms==0) {
            System.out.println("Error, 0 rooms? it's not real");
        } else {
            System.out.println("Not full, free space is left");
        }

        System.out.println("");
        System.out.println("~~~ end of program ~~~");

        scanner.close();
    }
}
