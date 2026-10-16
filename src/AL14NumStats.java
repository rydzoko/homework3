import java.util.Scanner;

public class AL14NumStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNext= 10;
        int stats, pos=0, neg=0, zer=0, eve=0, odd=0, i=0;
        System.out.print("Let's have a statistic of 10 numbers, I mean, about their state!");
        for (; iNext>0 ;iNext--){
            System.out.print("\nEnter "+(i +=1)+" number: ");
            stats = sc.nextInt();

            if (stats > 0) {
                pos++;
            } if (stats < 0){
                neg++;
            } if (stats == 0) {
                zer++;
            } if (stats%2==0){
                eve++;
            } if (!(stats%2==0)) {
                odd++;
            }
        }
        System.out.println("\nOkay, I've got it!\nNow take a look at your statistics: ");
        System.out.println("\n=========Satistics=========");
        System.out.println("Positive numbers: "+pos+"\nNegative numbers: "+neg+"\nZeros: "+zer+"\nEven numbers: "+eve+"\nOdd numbers: "+odd);
        System.out.println("\nThanks for testing!");

        sc.close();

    }
}
