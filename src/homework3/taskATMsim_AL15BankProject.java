//homework was made according to requirements in the pdf, huh

package homework3;
import java.util.Scanner;

public class taskATMsim_AL15BankProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = "";
        int pin = 1122, pinLog, att=3, oper=0;
        float bal=2000, dep=0, with=0;


        System.out.println("======Simple ATM======\nWelcome to our bank!~\nBefore continuing, please log in.\nLogin username: ");
        //optionally added a username logging feature
        for (;;) {
            name = sc.next();
            if (!(name.equalsIgnoreCase("Aziret"))) {
            System.out.println("Sorry, your username were not found. Try again.");
            System.out.println("Loging username: ");

        }else if (name.equalsIgnoreCase("Aziret"))  {
            System.out.println("\nThe user was found!\n");
            break;
        }

        }

        System.out.print("Enter the PIN: ");

        //entering the pin and checking the attempts
        for (;;) {
            pinLog= sc.nextInt();
             if (!(att>1)) {
                System.out.println("Your account has been blocked.");
                sc.close();//before it gets terminated, the scanner should be closed
                System.exit(0); //the program then ends afterwards
            } else if (!(pin==pinLog)) {
                System.out.println("Incorrect password!");
                --att;
                System.out.println("Remaining attempts: "+att);
                System.out.print("Enter the PIN: ");
            } else if (pin==pinLog) {
                System.out.println("\nLogin successful!");
                break;
            }
        }
        //apparently i need to name a loop before using a "break;(+name of a loop)" command, that collapses the entire loop so you get out of it immediately
        someLoop:
        for (;;) {
            System.out.println("\n======ATM Menu======\n1)Check balance.\n2)Deposit money\n3)Withdraw money\n4)Exit");
            System.out.print("Choose an operator: ");
            oper = sc.nextInt();
            switch (oper) {
                case 1: {
                    System.out.println("\nYour current balance is: $"+bal);
                    break;
                }
                case 2: {
                    System.out.println("Enter amount for depositing: ");
                    dep = sc.nextFloat();
                    if (dep<0||dep==0) {
                        System.out.println("\nInvalid option, depositing 0 or less is not possible.");
                        break;
                    } else if (dep > 0) {
                        System.out.println("\nDepositing successful!\n\nYour new balance: $"+(bal += dep));
                        dep = 0;
                        break;
                        
                    }
                }

                case 3: {
                    if (bal<=0) { //there the if statement checks if a user's balance is equal or less than zero, if true, it will kick them out right away
                        System.out.println("\nImpossible to withdraw! Balance is 0 or less.");
                        break;
                    } 
                    System.out.println("Enter amount for withdrawing: ");
                    with = sc.nextFloat();
                    
                    if (bal<with) {
                        System.out.println("\nImpossible to withdraw! Withdrawal cannot exceed your balance.");
                        break;
                    }

                    System.out.println("\nWithdrawal successful!\n\nYour new balance is: $"+(bal -= with));
                    with = 0;
                    break;
                    
                }
                case 4: {
                    System.out.println("\nThank you for using the ATM! ^-^");
                    break someLoop; //here it is, 

                }
                default: {
                    System.out.println("\nInvalid option! Try again.");
                    break;
                }
            }
        }

        sc.close();

    }
}
