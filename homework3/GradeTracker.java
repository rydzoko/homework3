import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opt;
        double assignCoun=0,exCoun=0, scoreAssignEx, totalAssignPoin=0, totalExPoin=0, assignAvg=0, exAvg=0, overllAvg=0;
        String extEnt, grade="", status="";
        
        okigotyou:
        for(;;){

            System.out.println("\n===== Semester Grade Tracker =====\n");
            System.out.println("1. Add assignment result\n2. Add exam result\n3. View current grade\n4. Exit\n");
            System.out.print("Choose an option: ");

            
            opt = sc.nextInt();
            hello:
            switch (opt) {
                case 1 -> {
                    System.out.print("\nEnter assignment score (0-100): ");
                    scoreAssignEx = sc.nextInt();
                    if ((scoreAssignEx < 0)||(scoreAssignEx>100)){
                        System.out.println("\nYou cannot add a score below 0 or above 100!\n");
                        break hello;
                        
                    }
                    totalAssignPoin+=scoreAssignEx;
                    assignCoun++;
                    System.out.println("\nAssignment score added!");
                    
                }
                case 2 ->{
                    System.out.print("\nEnter exam score (0-100): ");
                    scoreAssignEx = sc.nextInt();
                    if ((scoreAssignEx < 0)||(scoreAssignEx>100)) {
                        System.out.println("You cannot add a score below 0 or above 100!");
                        break hello;

                    }
                    totalExPoin+=scoreAssignEx;
                    exCoun++;
                    System.out.println("\nExam score added!");
                    

                }
                case 3 ->{
                    if (assignCoun==0 || exCoun ==0){
                        if (assignCoun>0^exCoun>0){
                            System.out.println("\nYou seem to be only having either assignment scores, or exam points.\nHowever you must have both before accessing the results.");
                            break;
                        }
                        System.out.println("\nNo results available yet. You must have scores before accessing the results.");
                        break;
                    }
                    assignAvg = totalAssignPoin/assignCoun;
                    exAvg = totalExPoin/exCoun;
                    overllAvg = (assignAvg*0.5)+(exAvg*0.5);
                    
                    if (overllAvg >= 90) {
                        grade = "A";
                        status = "passing";
                    } else if (overllAvg >= 80) {
                        grade = "B";
                        status = "passing";
                    } else if (overllAvg >= 70) {
                        grade = "C";
                        status = "passing";
                    } else if (overllAvg >= 60) {
                        grade = "D";
                        status = "passing";
                    } else {
                        grade = "F";
                        status = "failing";
                    }

                    
                    System.out.println("\n===== Current Results =====\n");
                    System.out.println("Assignments completed: "+assignCoun);
                    System.out.println("Assingments average: "+assignAvg+"\n");
                    
                    System.out.println("Exams completed: "+exCoun);
                    System.out.println("Exam average: "+exAvg+"\n");

                    System.out.println("Overall average: "+overllAvg);
                    System.out.println("Grade: "+grade);
                    System.out.println("Status: "+status);
                    while (true){
                        System.out.print("\nPress ENTER to quit...");
                        sc.nextLine();
                        extEnt = sc.nextLine();
                        if (extEnt.isBlank()){
                            break;
                        }
                    }
                }
                case 4 -> {
                    System.out.println("\nGrade tracker closed. See you later!");
                    break okigotyou;
                }
                default -> {
                    System.out.println("Please, select an option ranging from 1 to 4.");
                }
            }

        }
        sc.close();       
    }
}
