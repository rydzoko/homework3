public class AL14Methods {
    public static void greetUser(String name){
        System.out.println("Hello "+name+"! Welcome to java.");
    }
    public static void sayHello() {
        System.out.println("HELLO!");
    }
    public static int multiply(int x, int y){
        int result = x*y;
        return result; //returns an integer

    }
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static double sum(double a, double b){
        return a+b;

    }

    public static void main(String[] args) {
        System.out.println("Program started...");
        sayHello();
        sayHello(); //yep, it can be called multiple times

        System.out.println();

        greetUser("Aziret");
        greetUser("i dont know who are you");

        System.out.println();

        int product = multiply(20, 6);
        System.out.println("The product is: "+product);

        System.out.println("34*4= "+multiply(34, 4)); //we're able to use the same parameters even though they were changed before

        System.out.println("here is the answer of 20.45+29.21= "+sum(20.45, 29.21));


        int sum = sum(20, 46);
        System.out.println("The final value will be: "+sum);
        
        
        System.out.println("Program finished...");

        /**So this thing should only contain my 
         */


    }
    
}