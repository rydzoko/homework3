import java.util.Scanner;

public class AL7DiscountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totPurchAmount, numbPrevOrds, discoun, purchAmountMinusDisc, discAmount;
        boolean isPremMemb, hasDiscCoup, isTheirBirthMonth;

        System.out.println("======Online Store Discount System======");
        System.out.println("Pease go throuh these questions below to get to know about your discount aviability:");
        System.out.println("What is your total purchase amount so far (in dollars)?: ");
        totPurchAmount = scanner.nextDouble();
        System.out.println("Are you a premium member? (true/false): ");
        isPremMemb = scanner.nextBoolean();
        System.out.println("The number of previous orders?: ");
        numbPrevOrds = scanner.nextDouble();
        System.out.println("Do you have a discount coupon? (true/false): ");
        hasDiscCoup = scanner.nextBoolean();
        System.out.println("Is this your birthday month? (true/false): ");
        isTheirBirthMonth = scanner.nextBoolean();
        //building an if statement for 20% discount
        if (totPurchAmount>=200 && isPremMemb==true && (hasDiscCoup==true || isTheirBirthMonth==true)) {
            purchAmountMinusDisc = totPurchAmount - (totPurchAmount * 0.20);
            discoun = 20;
            discAmount = totPurchAmount - purchAmountMinusDisc;
        } 
        //for 15 percent
        else if (totPurchAmount>=150 && (isPremMemb || numbPrevOrds>=10)) {
            purchAmountMinusDisc = totPurchAmount - (totPurchAmount * 0.15);
            discoun = 15;
            discAmount = totPurchAmount - purchAmountMinusDisc;
        }
        //now 10%
        else if (totPurchAmount>=100 && hasDiscCoup==true) {
            purchAmountMinusDisc = totPurchAmount - (totPurchAmount * 0.10);
            discoun = 10;
            discAmount = totPurchAmount - purchAmountMinusDisc;
        } 
        //i thought why not add 5 percent as well since there a gap between 100 and 20 dollars
        else if ((totPurchAmount>20)) {
            purchAmountMinusDisc = totPurchAmount - (totPurchAmount * 0.05);
            discoun = 5;
            discAmount = totPurchAmount - purchAmountMinusDisc;
        } else {
            purchAmountMinusDisc = totPurchAmount;
            discoun = 0;
            discAmount  = 0;
        }

        if (totPurchAmount<0) {
            System.out.println("\n"+totPurchAmount+"$?");
            double posTotPurchAmount = Math.abs(totPurchAmount);
            System.out.println("We're NOT gonna pay you "+posTotPurchAmount+"$. Idiot.");
            System.exit(0);
        }



        System.out.println("\nHere's what you've got:");
        System.out.println("Total: "+totPurchAmount+"$.");
        System.out.println("Your discount: "+discoun+"%.");
        System.out.println("Discount amount: "+discAmount+"$.");
        System.out.println("Final amount: "+purchAmountMinusDisc+"$.");


        scanner.close();

    }
}