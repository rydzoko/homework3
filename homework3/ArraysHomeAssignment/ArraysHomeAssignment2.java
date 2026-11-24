package ArraysHomeAssignment;

public class ArraysHomeAssignment2 {
    public static void main(String[] args) {
        
        int[] arrayTwoMaxes = {1,53,77,2,61,45};
        // int[] arrayTwoMaxes = {6,6,6,6,6,6};
        int arraylenth = arrayTwoMaxes.length;
        int lar=arrayTwoMaxes[0];
        int sec=arrayTwoMaxes[0];
        for (int i = 0; i < arrayTwoMaxes.length; i++) {
            if (lar<arrayTwoMaxes[i]) {
                lar = arrayTwoMaxes[i];
            } else if (lar == arrayTwoMaxes[i]) {
                arraylenth--;
            }
        }

        for (int i = 0; i < arrayTwoMaxes.length; i++){
            if (arrayTwoMaxes[i]==lar) {
                continue;
            } else if (sec<arrayTwoMaxes[i]) {
                sec = arrayTwoMaxes[i];
            } 

        }
        System.out.println("Array: ");
        for (int i = 0; i < arrayTwoMaxes.length; i++) {
            System.out.print(arrayTwoMaxes[i]+" ");
        }
        if (arraylenth ==0) {
            System.out.println("No second largest distinct number (All numbers are similar)");
            System.exit(0);
        }

        System.out.println("\nThe largest value: "+lar);
        System.out.println("The second Largest number: "+sec);
        

    }


}
