public class AL {
    public static void main(String[] args) {
    
    System.out.println("1))Testing...");

    int dataLevel1 = 10;
    long distance1 = 8000L;
    float pi1 = 3.1415f;
    char userInitial1 = 'A';

    

    double var1;
    double var2;
    double var3;
    double var4;
    double var5;
    double var6;
    double var7;
    double var8;

    var1 = 29;
    var2 = 12;
    var3 = 87;
    var4 = -40;
    var5 = 33.22;
    var6 = 9989;
    var7 = -7878;
    var8 = 1.9283;

    double total1 = var1 * var2 + var3;
    
    double total2 = (var1 + var3) / var2;

    double total3 = var6 - var3 / var8;

    double total4 = (var3 - var8) * var7;

    double total5 = var7 + var4 - var6;
    
    double total6 = var2 / var3 + var5;

    double total7 = var1 * var1 + var8;

    double total8 = (var2+var6)-var3;
    
    double total9 = var8-(var4-var3);

    double total10 = var5*var5*(var1-var2);



    System.out.println(dataLevel1);
    System.out.println(distance1);
    System.out.println(pi1);
    System.out.println(userInitial1);

    System.out.println();

    System.out.println("2))There i'm going to show how those saved variables can be used once created: ");
    
    System.out.println();

    System.out.println("1."+var1+" times "+var2+" plus "+var3+" equals to: "+total1);
    System.out.println("2."+var1+" plus "+var3+" in brakets divided by "+var2+" equals to: "+total2);
    System.out.println("And so on...");
    //number 3
    System.out.println("3."+var6+"-"+var3+":"+var8+"="+total3);
    //number 4
    System.out.println("4."+"("+var3+"-"+var8+") *"+var7+"="+total4);
    //number 5
    System.out.println("5."+var7+"+"+var4+"-"+var6+"="+total5);
    //number 6
    System.out.println("6."+var2+":"+var3+"+"+var5+"="+total6);
    //number 7
    System.out.println("7."+var1+"*"+var1+"+"+var8+"="+total7);
    //number 8
    System.out.println("8."+"("+var2+"+"+var6+") -"+var3+"="+total8);
    //number 9
    System.out.println("9."+var8+"- ("+var4+"-"+var3+") ="+total9);
    //number 10
    System.out.println("10."+var5+"*"+var5+"* ("+var1+"-"+var2+") ="+total10);


    System.out.println();

    System.out.println("3)) The final third task includes implicit conversion (Widening) and explicit one (Narrowing/Shrinking)");

    int standardNumber = 3400;
    
    System.out.println("if i print it without converting, it will remain the same: "+standardNumber);
    
    System.out.println();

    double bigNumber = standardNumber;

    System.out.println("Ok, it was converted, and now it looks like this: "+bigNumber);

    double precisePercentage = 99.99;

    System.out.println("I got the first example widen, but I can do the opposite thing, by narrowing/shrinking: "+precisePercentage);

    System.out.println("This is the initial state of it, but let us shrink it when it converts to int...");

    int roundedPercentage = (int) precisePercentage;

    System.out.println("Here: "+roundedPercentage);

    System.out.println();

    System.out.println("And so on...");



    }
    
}
