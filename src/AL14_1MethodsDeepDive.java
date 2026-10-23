public class AL14_1MethodsDeepDive {
    public static int printNumbers(int x){
        for (x=1;x<=10;x++){
            System.out.print(x+" ");
            
        }
        return x;   
    }
    public static boolean isEven(int a){
        if (a%2==0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        printNumbers(2);
        
    }
}
