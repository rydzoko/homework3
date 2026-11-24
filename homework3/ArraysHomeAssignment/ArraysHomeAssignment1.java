package ArraysHomeAssignment;

public class ArraysHomeAssignment1 {
    public static void main(String[] args) {
        //Task 1, replacing negative numbers wiht zero

        int[] array = {7,-2,5,-1,3,6,4,-8,0,9};
        int[] zeroArray = new int[10];
        int rep = 0;
        for (int i =0; i<array.length;i++) {

            if (array[i]<0) {
                zeroArray[i] = 0;
                rep+=1;
            } else {
                zeroArray[i] = array[i];
            }
        }

        System.out.print("\nOriginal Array: ");
        for (int i =0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.print("\nNegative-to-Zero Change: ");
        for (int i =0; i<array.length; i++) {
            System.out.print(zeroArray[i]+" ");
        }
        System.out.println("\nReplacements: "+rep);

    }
}
