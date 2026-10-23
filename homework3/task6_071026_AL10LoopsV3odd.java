//practice session, 6th task
//printing odd numbers till it gets to the input number of user's


import java.util.Scanner;
public class task6_071026_AL10LoopsV3odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int n;

        System.out.println("Enter your number: ");
        n = scanner.nextInt();
        if (n%2 == 0) {
                i += 1;
            }

        for (; i < n; i += 2 ) {
        System.out.println(i);
        }
    scanner.close();
    }
    
}
