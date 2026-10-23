//practice session, task 7th
//code is written according to how task was described,
//i used for loops, ints, and booleans, due to me, wanting to make a user 
// to decide whether they finished playing with it or they want to continue


import java.util.Scanner;

public class task7_071026_AL13FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, att= 5;
        boolean ext;
        
        System.out.print("Numbers from 1 to 20 are going to checked for either being divisible by 3 or 5\nEnter a number: ");
        num =sc.nextInt();
        for (; num >= 1 && num <= 20; att--) {
            if (num%3 == 0 && num%5==0) {
                System.out.println("It's FizzBuzz\nEnter the next number: ");
            } else if (num %3 == 0){
                System.out.println("It's Fizz\nEnter the next number: ");
            } else if (num%5 == 0) {
                System.out.println("It's Buzz\nEnter the next number: ");
            } else if (!(num%3==0 || num %5==0)) {
                System.out.println("Your number is divisible by neither 3 nor 5.\nEnter the next number: ");
            }

            if (att == 0){
                System.out.println("Wait, you checked your number 5 times, do you want to exit? (true/false)");
                ext = sc.nextBoolean();
                if (ext) {
                    System.out.println("\nThanks for testing!");
                    sc.close();
                    System.exit(0);
                } else {
                    att +=5;
                    System.out.println("Enter the next number: ");
                }
            }
            num=sc.nextInt();


            
        }
        if (!(num >= 1 && num <= 20)) {
            System.out.println("Please choose a number from a range of 1 to 20.");
        }



        sc.close();
    }
    
}
