package ArraysPractice;
public class ArraysPractice1{
    public static void main(String[] args) {
        int[] num10 = {5,10,-5,1,-6,11,324,-67,0,91};
        int pos=0, neg=0, zer=0;
        for (int i =0; i<num10.length; i++){
            if (num10[i]>0) {
                pos++;
            } else if (num10[i]==0) {
                zer++;
            } else {
                neg++;
            }
        
        }
        System.out.print("Array: ");
        for (int i=0; i<num10.length; i++){
            System.out.print(num10[i]+" ");
        }

        System.out.println("\nPositive: "+pos);
        System.out.println("Negative: "+neg);
        System.out.println("Zero: "+zer);
    }
}