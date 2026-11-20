package ArraysPractice;

import java.util.Scanner;

public class ArraysPractice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] userScores = new int[5];
        int pass=0, fail=0, inp;
        
        System.out.println("Enter your 5 scores, from 0-100:");
        for (int i =0; i<userScores.length; i++){
            for (;;){
            inp = sc.nextInt();
            if (inp <0) {
                System.out.println("Invalid input, the score must be positive.");
            } else 
                break;
            } if (inp<60) {
                fail++;
            } else {
                pass++;
            }
            userScores[i] = inp;
        }
        int sum=0;
        double avg=0;
        int i=0;
        for (;i<userScores.length;i++) {
            sum += userScores[i];
        }
        avg = (sum/i);

        System.out.println("\n\nScores: ");
        i=0;
        for (;i<userScores.length;i++) {
            System.out.print(userScores[i]+" ");
        } System.out.println("\nPassed: "+pass);
        System.out.println("Failed: "+fail);
        System.out.println("Average of all scores: "+avg);

        sc.close();

    }
    
}
