import java.util.Scanner;
public class StoreCheckout {
    public static void main(String[] args) {
    //my objective: build a console store that accepts multiple products, 
    //validate input, calculates discounts, processes payment, and prints a receipt.
    Scanner sc = new Scanner(System.in);
    int opt, mouseAmo=0, keyAmo=0, headAmo=0, lapAmo=0, allWholeAmo=0, mouseWhAmo=0,keyWhAmo=0,headWhAmo=0,lapWhAmo=0, pseudoCalc=0, discTotal=0;
    double mouseDiscPr=0, keyDiscPr=0, headDiscPr=0, lapDiscPr=0, subTotalIt=0,subTotalItDisc=0, totalDisc=0, payment, change=0, discInMoney=0;
    boolean isContin, couponRew=false;
    String mouSt=" Mouse",keySt=" Keyboard",headSt=" Headphones",lapSt=" Laptop-Stand", congratSt="Congrats! You've got a 5% (separated) discount(s) for the following item(s):"; 
    String mostPurchIt, discTotalSt="", couponRewSt="";
    
    System.out.println("\nHI and WELCOME to our online Simple Store!");
    problemsStartHere:
    for (;;){
        
        System.out.println("\n======== Simple Store ========\n\n1. Mouse             - $20\n2. Keyboard          - $40 \n3. Headphones        - $50\n4. Laptop stand      - $30\n5. Checkout\n6. Check cart");
        System.out.print("\nChoose an option: ");
        opt = sc.nextInt();
        
        switch (opt) {
            case 1 -> {
                System.out.print("\n\nChosen: Mouse\nCost: $20\nEnter amount: ");
                mouseAmo = sc.nextInt();
                if (!(mouseAmo<=0)){
                    pseudoCalc = 20 * mouseAmo;
                    allWholeAmo += mouseAmo;
                    mouseWhAmo += mouseAmo;
                    System.out.println("$20 * "+mouseAmo+" = "+"$"+pseudoCalc);
                    System.out.println("Added to your cart!");
                    pseudoCalc = 0;
                    System.out.print("Continue shopping? Enter 'false' for getting straight into checkout(true/false): ");
                    isContin = sc.nextBoolean();
                    if (isContin) {
                        //empty...
                    } else {
                        System.out.println("\nOk, It seems you've done shopping, let's now get you through the checkout...\n");
                        break problemsStartHere;
                    }
                } else {
                    System.out.println("\nYou're not able to add negative or zero amount to your cart\n");
                }
            }
            case 2 -> {
                System.out.print("\n\nChosen: Keyboard\nCost: $40\nEnter amount: ");
                keyAmo = sc.nextInt();
                if (!(keyAmo<=0)) {
                    pseudoCalc = 40 * keyAmo;
                    allWholeAmo += keyAmo;
                    keyWhAmo+=keyAmo;
                    System.out.println("$40 * "+keyAmo+" = "+"$"+pseudoCalc);
                    System.out.println("Added to your cart!");
                    pseudoCalc=0;
                    System.out.print("Continue shopping? Enter 'false' for getting straight into checkout(true/false): ");
                    isContin = sc.nextBoolean();
                    if (isContin) {
                        //hopa
                    } else {
                        System.out.println("\nOk, It seems you've done shopping, let's now get you through the checkout...\n");
                        break problemsStartHere;
                    }

                } else {
                    System.out.println("\nYou're not able to add negative or zero amount to your cart\n");
                }

            }
            case 3 -> {
                System.out.print("\n\nChosen: Headphones\nCost: $50\nEnter amount: ");
                headAmo = sc.nextInt();
                if (!(headAmo<=0)) {
                    pseudoCalc = 50 * headAmo;
                    allWholeAmo += headAmo;
                    headWhAmo+=headAmo;
                    System.out.println("$50 * "+headAmo+" = "+"$"+pseudoCalc);
                    System.out.println("Added to your cart!");
                    pseudoCalc=0;
                    System.out.print("Continue shopping? Enter 'false' for getting straight into checkout(true/false): ");
                    isContin = sc.nextBoolean();
                    if (isContin) {
                        //yep...
                    } else {
                        System.out.println("\nOk, It seems you've done shopping, let's now get you through the checkout...\n");
                        break problemsStartHere;
                    }

                } else {
                    System.out.println("\nYou're not able to add negative or zero amount to your cart\n");
                }

            }
            case 4 -> {
                System.out.print("\n\nChosen: Laptop Stand\nCost: $30\nEnter amount: ");
                lapAmo = sc.nextInt();
                if (!(lapAmo<=0)) {
                    pseudoCalc = 30 * lapAmo;
                    allWholeAmo += lapAmo;
                    lapWhAmo+=lapAmo;
                    System.out.println("$30 * "+lapAmo+" = "+"$"+pseudoCalc);
                    System.out.println("Added to your cart!");
                    pseudoCalc=0;
                    System.out.print("Continue shopping? Enter 'false' for getting straight into checkout(true/false): ");
                    isContin = sc.nextBoolean();
                    if (isContin) {
                        //loading...
                    } else {
                        System.out.println("\nOk, It seems you've done shopping, let's now get you through the checkout...\n");
                        break problemsStartHere;
                    }

                } else {
                    System.out.println("\nYou're not able to add negative or zero amount to your cart\n");
                }

            }
            case 5 -> {
                if (allWholeAmo<=0){
                    System.out.println("\nYou didn't choose anything, so we dont need to waste our time on you. heh...\n");
                    sc.close();
                    System.exit(0);
                } else {
                    System.out.println("\nIt seems you've done shopping, let's now get you through the checkout...\n");
                    break problemsStartHere;
                }
            }
            case 6 -> {
                //there i added the third bonus,
                System.out.println("Your chosen ones: ");
                System.out.println("\n--Quantities and Price--\nMouse:           "+mouseWhAmo+" ($"+(20*mouseWhAmo)+")"+"\nKeyboard:        "+keyWhAmo+" ($"+(40*keyWhAmo)+")"+"\nHeadphones:      "+headWhAmo+" ($"+(50*headWhAmo)+")"+"\nLaptop Stand:    "+lapWhAmo+" ($"+(30*lapWhAmo)+")"+"\n-----------------------\nCurrent total:   "+allWholeAmo+" ($"+((20*mouseWhAmo)+(40*keyWhAmo)+(50*headWhAmo)+(30*lapWhAmo))+")");
            }
        
            default -> System.out.println("\nInvalid option.\nPlease choose from 1 to 6.\n");
        }        

    }
    //let's continue with the rest of a program
    //bonuses!
    //#1 If the customer buys 5 or more units of the same product, give a 5% discount on that product purchase
    if ((mouseWhAmo >= 5)||(keyWhAmo >= 5)||(headWhAmo >= 5)||(lapWhAmo >= 5)){
        if ((mouseWhAmo >= 5)){
            mouSt += " -";
            mouSt += 5;
            mouSt += "%";
            congratSt += mouSt;
            mouseDiscPr = (20*mouseWhAmo) * 0.95;
        } else {
            mouseDiscPr = (20*mouseWhAmo);
        } 
        if ((keyWhAmo >= 5)){
            keySt += " -";
            keySt += 5;
            keySt += "%";
            congratSt += keySt;
            keyDiscPr = (40*keyWhAmo) * 0.95;
        } else {
            keyDiscPr = (40*keyWhAmo);
        }
        if ((headWhAmo >= 5)){
            headSt+= " -";
            headSt += 5;
            headSt+= "%";
            congratSt +=headSt;
            headDiscPr = (50*headWhAmo) * 0.95;
        } else {
            headDiscPr = (50*headWhAmo);
        }
        if ((lapWhAmo >= 5)){
            lapSt += " -";
            lapSt += 5;
            lapSt += "%";
            congratSt +=lapSt;
            lapDiscPr = (30*lapWhAmo) * 0.95;
        } else {
            lapDiscPr = (30*lapWhAmo);
        }
        
    } else {
        mouseDiscPr = (20*mouseWhAmo);
        keyDiscPr = (40*keyWhAmo);
        headDiscPr = (50*headWhAmo);
        lapDiscPr = (30*lapWhAmo);
    }
    
    subTotalItDisc = (mouseDiscPr+keyDiscPr+headDiscPr+lapDiscPr);
    subTotalIt = ((20*mouseWhAmo)+(40*keyWhAmo)+(50*headWhAmo)+(30*lapWhAmo));
    if (subTotalIt==subTotalItDisc) {
        congratSt = "";
    }
    //bonus 2
    //below 100 - no discount, 100-199 - 10% discount, 200 and more - 15% discount
    hehe:
    for (;;) {
    if (subTotalItDisc>=100) {
        if (subTotalItDisc>=200){
            totalDisc = (subTotalItDisc*0.85);
            discTotalSt = "You receaved a 15% discount for the total!";
            discTotal= 15;
            discInMoney = (subTotalItDisc*0.15);
            break hehe;
        }
        totalDisc = (subTotalItDisc*0.90);
        discTotalSt = "You receaved a 10% discount for the total!";
        discTotal=10;
        discInMoney = (subTotalItDisc*0.10);
        break hehe;
    } else {
        totalDisc = subTotalItDisc;
        discTotalSt = "";
        break hehe;
    }
    }
    //bonus 4
    

    if ((mouseWhAmo>=keyWhAmo)&&(mouseWhAmo>=headWhAmo)&&(mouseWhAmo>=lapWhAmo)) {
        mostPurchIt = "Mouse";
    } else if ((keyWhAmo>=mouseWhAmo)&&(keyWhAmo>=headWhAmo)&&(keyWhAmo>=lapWhAmo)) {
        mostPurchIt = "Keyboard";
    } else if ((headWhAmo>=mouseWhAmo)&&(headWhAmo>=keyWhAmo)&&(headWhAmo>=lapWhAmo)){
        mostPurchIt= "Headphones";
    } else {
        mostPurchIt ="Laptop-Stand";
    }

    if ((mouseWhAmo==keyWhAmo)&&(keyWhAmo==headWhAmo)&&(headWhAmo==lapWhAmo)){
        mostPurchIt = "Wait, all quantities seem to be equal";
    }
    
    //bonus #5
    if (allWholeAmo>=10) {
        couponRew = true;
    }
    //chech out starts there, finally!!
    System.out.println("\n======== Check Out ========\n");
    System.out.println("\n--Statistics (Amount/Price)--\nMouse:           "+mouseWhAmo+" ($"+(20*mouseWhAmo)+")"+"\nKeyboard:        "+keyWhAmo+" ($"+(40*keyWhAmo)+")"+"\nHeadphones:      "+headWhAmo+" ($"+(50*headWhAmo)+")"+"\nLaptop Stand:    "+lapWhAmo+" ($"+(30*lapWhAmo)+")");
    System.out.println("Items purchased: "+allWholeAmo+"\nSubtotal: $"+subTotalIt+"\n");

    System.out.println(congratSt);

    if (!(subTotalIt==subTotalItDisc)){
        System.out.println("With item discount: $"+subTotalItDisc+" (new current total)");
    }
    System.out.println(discTotalSt);
    if (discTotal==0) {
        System.out.println("Total discount: None\nTotal: $"+totalDisc);
        
    } else {
        System.out.println("\nTotal discount: "+discTotal+"% ($"+discInMoney+")"+"\nTotal: $"+totalDisc);
    }


    spendingMoney:
    for(;;) {
        System.out.println("Enter payment amount: ");
        payment = sc.nextDouble();
        ill:
        for (;;) {
        if (payment<totalDisc){
            System.out.println("Insufficient payment\nYou still need to pay: $"+(totalDisc-payment)+"\nPlease, pay the full amount in order to proceed.");
            break ill;
        } else if (payment==totalDisc){
            System.out.println("Payment successful!");
            break spendingMoney;
        } else {
            System.out.println("Payment successful!\nChange: $"+(change += (payment-totalDisc)));
            break spendingMoney;
        }
        }  
    }
    
    System.out.println("=======================\n      Simple Store\n=======================");
    System.out.println("Item purchased: "+allWholeAmo);
    System.out.println("Subtotal: $"+subTotalItDisc);
    System.out.println("Discount: "+discTotal+"% ($"+discInMoney+")");
    System.out.println("Final Total: $"+totalDisc);
    System.out.println("Payment: $"+payment);
    System.out.println("Change: $"+change+"\n");

    System.out.println("The most purchased item: "+mostPurchIt);
    if (mostPurchIt.equalsIgnoreCase("Mouse")) {
        System.out.println("Quantity: "+mouseWhAmo);
    } else if (mostPurchIt.equalsIgnoreCase("Keyboard")){
        System.out.println("Quantity: "+keyWhAmo);
    } else if (mostPurchIt.equalsIgnoreCase("Headphones")){
        System.out.println("Quantity: "+headWhAmo);
    } else {
        System.out.println("Quantity: "+lapWhAmo);
    }
    if (couponRew){
        couponRewSt = "\nWhoa! You also earned a $10 coupon for your next visit!";
    } else {

    }
    System.out.println(couponRewSt);
    System.out.println("=======================\nThank you for shopping!\n=======================");
    sc.close();
    }
}
