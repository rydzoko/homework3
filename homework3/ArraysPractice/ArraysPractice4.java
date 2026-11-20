package ArraysPractice;
public class ArraysPractice4{
    public static void main(String[] args) {
        int[] origin = {5,23,11,15,234,8,12,13};
        int[] revers = new int[8];
        int j =0;
        for (int i =(origin.length-1); i>=0;i--, j++) {
                revers[j] = origin[i];
        }
        System.out.println("Original: ");
        for (int i=0; i<origin.length; i++){
            System.out.print(origin[i]+" ");
        }
        System.out.println("\nReversed: ");
        for (int i=0; i<origin.length; i++){
            System.out.print(revers[i]+" ");
        }

    }   

}