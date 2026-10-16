import java.util.Scanner;

public class AL6LoanApproval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int age, monthIncome, crScore, jobYears;
        boolean isInDebt;
        boolean apprStatus;
        char ageStatus, monIncStatus, crScorStatus, numOfJobYStatus, numOfJobYStatusisInDebt, isInDebtChar;

        System.out.println("-----------Loan Approval System-----------");
        System.out.println("Thank you for applying to our loan service!");
        System.out.println("What you need in order to be approved?");
        System.out.println("Answer these questions to find out:");
        System.out.print("What's your age: ");
        age = scanner.nextInt();
        System.out.print("What's your monthly income (in som): ");
        monthIncome = scanner.nextInt();
        System.out.print("Number of credit scores: ");
        crScore = scanner.nextInt();
        System.out.print("Number of years at currect job: ");
        jobYears = scanner.nextInt();

        System.out.print("You have existing debt (true/false): ");
        isInDebt = scanner.nextBoolean();
        //if statements for the age status and etc.
        if (age>=21 && age<=65) {
            ageStatus = '☑';
        } else {
            ageStatus = '☒';
        }
        //check for the income status
        if (monthIncome>=30000) {
            monIncStatus = '☑';
        } else {
            monIncStatus = '☒';
        }
        //check for the credit scores
        if (crScore>=70) {
            crScorStatus = '☑';
        } else {
            crScorStatus = '☒';
        }
        //status of years at job
        if (jobYears>=2) {
            numOfJobYStatus = '☑';
        } else {
            numOfJobYStatus = '☒';
        }
        //check if at least one of those two is true
        if (jobYears>=2 || !isInDebt) {
            numOfJobYStatusisInDebt = '☑';
        } else {
            numOfJobYStatusisInDebt = '☒';
        }
        //check for the debp status as a character
        if (!isInDebt) {
            isInDebtChar = '☑';
        } else {
            isInDebtChar = '☒';
        }

        if ((crScore>100 || crScore < 0 ) || age < 0 || monthIncome < 0 || jobYears < 0) {
            System.out.println("Error, impossible values were entered, please try again.");
            scanner.close();
            System.exit(0);
        }

        if ((age>=21 && age<=65) && (monthIncome>=30000) && (crScore>=70) && (jobYears>=2 || !isInDebt)) {
            apprStatus = true;
        } else {
            apprStatus = false;
        }

        System.out.println("\n-----------The status of Aprovement-----------");
        System.out.println("Age: "+age+" (required: Within 21 to 65.) "+ageStatus);
        System.out.println("Monthly income: "+monthIncome+" (required: 30000 or more.) "+monIncStatus);
        System.out.println("Credit scores: "+crScore+" (required: 70 or more.) "+crScorStatus);
        System.out.println("\nThe ones that require at least one being satisfied: "+numOfJobYStatusisInDebt);
        System.out.println("Number of years at the current job: "+jobYears+" (required: 2 or more.) "+numOfJobYStatus);
        System.out.println("In-Debt status: "+isInDebt+" (required: No debt.) "+isInDebtChar);
        
        if (apprStatus) {
            System.out.println("\nOverall status: Approved.");
        } else {
            System.out.println("\nOverall status: Rejected.");
        }


        scanner.close();
    
        


    }
}
