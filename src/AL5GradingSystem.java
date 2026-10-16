import java.util.Scanner;

public class AL5GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int attendPoints, hWPoints, examPoints;
        //Gathering information about grades/scores
        System.out.println("Let's check if you're having them passing the requirements accross attendance, homework, and Exam points.\nSo first things first, your attendance (max: 10): ");
        attendPoints = scanner.nextInt();
        System.out.println("Tell about your homework points (max: 60): ");
        hWPoints = scanner.nextInt();
        System.out.println("Finally, the Exam points (max: 30): ");
        examPoints = scanner.nextInt();
        // Validating if the scores are within an acceptable range
        if ((attendPoints>10 || attendPoints<0) || (hWPoints>60 || hWPoints<0) || (examPoints>30 || examPoints<0)) {
            System.out.println("Error, non-possible value(s) was(were) entered.");
        } else if (attendPoints<6 || hWPoints<43 || examPoints<16) {
            System.out.println("Status: Fail. One or more was(were) not matching the required one(s).");
        } else if (attendPoints+hWPoints+examPoints>=65 && attendPoints+hWPoints+examPoints<=100) {
            System.out.println("Status: Passed.");
        }
    

        




        scanner.close();
    }
}
