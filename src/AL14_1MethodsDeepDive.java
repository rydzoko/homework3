public class AL14_1MethodsDeepDive {
    public static int printNumbers(int x){
        
        System.out.println("first");
        for (x=1;x<=10;x++){
            System.out.print(x+" ");
            
        }
        
        return x;   
    }
    public static boolean isEven(int a){
        if (a%2==0){
            System.out.println("second");
            System.out.println("Number is even");
            return true;
            } System.out.println("second"); 
            System.out.println("Number is odd");
            return false;
        
    }
    public static void main(String[] args) {
        printNumbers(2);
        System.out.println(isEven(11));
        
    }
}
