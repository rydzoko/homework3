import java.util.Scanner;

public class StudyTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weeklyGoal = 600,general=0 , opt, inMinutes, studSess=0, progStudMinutes=0, mathStudMinutes=0, engliStudMinutes=0, otherStudMinutes=0;
        sortofaloop:
        for(;weeklyGoal>general;) {
            System.out.print("\n===== Study Tracker =====");
            System.out.print("\n\n1. Add study session\n2. View statistics\n3. Check weekly goal\n4. Exit");
            System.out.print("\n\nChoose your option: ");
            opt = sc.nextInt();
            something:
            switch (opt) {
                case 1 -> {
                    System.out.print("\nChoose subject: \n1. Programming\n2. Mathematics\n3. English\n4. Other\n\nChoose your option: ");
                    opt = sc.nextInt();
                    switch (opt) {
                        case 1 -> {
                            System.out.print("Study time in minutes: ");
                            inMinutes = sc.nextInt();
                            if (inMinutes<=0){
                                System.out.println("\nInvalid, you cannot add 0 or negative numbers to the time.");
                                break;
                            }
                            progStudMinutes += inMinutes;
                            studSess++;
                            general+=inMinutes;
                            System.out.println("\n\nStudy session added!\nCurrently total study time for Programming: "+progStudMinutes+" minutes");
                            System.out.println("For general: "+general+" minutes");
                            break something;
                        }
                        case 2 -> {
                            System.out.print("Study time in minutes: ");
                            inMinutes = sc.nextInt();
                            if (inMinutes<=0){
                                System.out.println("\nInvalid, you cannot add 0 or negative numbers to the time.");
                                break;
                            }
                            mathStudMinutes += inMinutes;
                            studSess++;
                            general+=inMinutes;
                            System.out.println("\n\nStudy session added!\nCurrently total study time for Mathematics: "+mathStudMinutes+" minutes");
                            System.out.println("For general: "+general+" minutes");
                            break something;
                        }
                        case 3 -> {
                            System.out.print("Study time in minutes: ");
                            inMinutes = sc.nextInt();
                            if (inMinutes<=0){
                                System.out.println("\nInvalid, you cannot add 0 or negative numbers to the time.");
                                break;
                            }
                            engliStudMinutes += inMinutes;
                            studSess++;
                            general+=inMinutes;
                            System.out.println("\n\nStudy session added!\nCurrently total study time for English: "+engliStudMinutes+" minutes");
                            System.out.println("For general: "+general+" minutes");
                            break something;
                        }
                        case 4->{
                            System.out.print("Study time in minutes: ");
                            inMinutes = sc.nextInt();
                            if (inMinutes<=0){
                                System.out.println("\nInvalid, you cannot add 0 or negative numbers to the time.");
                                break;
                            }
                            otherStudMinutes += inMinutes;
                            studSess++;
                            general+=inMinutes;
                            System.out.println("\n\nStudy session added!\nCurrently total study time for Other: "+otherStudMinutes+" minutes");
                            System.out.println("For general: "+general+" minutes");
                            break something;
                        }

                        default -> {
                            System.out.println("\nInvalid option was entered. A range from 1 to 4 are only acceptable");
                            break;

                        }
                    }
                }
                case 2 -> {

                    System.out.println("\n===== Weekly Statistics =====");
                    System.out.println("Study sessions: "+studSess+"\nTotal study time: "+general);
                    System.out.println("\nProgramming: "+progStudMinutes+" minutes");
                    System.out.println("Mathematics: "+mathStudMinutes+" minutes");
                    System.out.println("English: "+engliStudMinutes+" minutes");
                    System.out.println("Other: "+otherStudMinutes+" minutes");
                    break;

                }
                case 3 -> {
                    System.out.println("\nWeekly goal: "+weeklyGoal+" minutes");
                    System.out.println("You studied: "+general+" minutes");
                    System.out.println("Remaining: "+(weeklyGoal-general)+" minutes");
                    break;
                }
                case 4 -> {
                    System.out.println("\nOk, But you must come back to studies sooner!");
                    sc.close();
                    break sortofaloop;
                }
            
                default -> {
                    System.out.println("\nInvalid option was entered. a range from 1 to 4 are only acceptable");
                    break;
                }
                    
            }



        }
        if (weeklyGoal==general){
            System.out.println("Wait, you seem to be already finished your weekly goal!");
            System.out.println(weeklyGoal+"="+general);
        } else if (weeklyGoal<general){
            System.out.println("Whoa! You've not just finished your weekly goal, you've overdone it!");
            System.out.println(weeklyGoal+"<"+general);
        }




    }
}
