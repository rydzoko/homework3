
import java.util.Scanner;

public class StudentGrader {
    public static String calculategrade(int score){
        
        if (score < 0 || score > 100) {
            return "Invalid Score";
        }
        String grade="";
        if (score>=90) {
            grade="A";
        } else if (score>=80) {
            grade="B";
        } else if (score>=70) {
            grade="C";
        } else if (score>=60) {
            grade="D";
        } else {
            grade="F";
        }
        return grade;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the score (0-100): ");
        int score = sc.nextInt();

        String finalGrade = calculategrade(score);

        System.out.println("The result is: "+finalGrade);

        sc.close();
    }
    
}
