package ArraysHomeAssignment;

public class ArraysHomeAssignment4 {
    public static void main(String[] args) {

        int[] array = {5, 2, 1, 6, 5, 1, 6, 1, 4, 4};
        // int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String dup = "";

        
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {

            //checking left side for already checked duplicatdes
            boolean alreadyChecked = false;
            for (int left = 0; left < i; left++) {
                if (array[left] == array[i]) {
                    alreadyChecked = true;
                    break;
                }
            }

            
            if (alreadyChecked) {
                continue;
            }

            //if alreadychecked is false, then this loop runs, it's about checking the right side for duplicates
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] == array[k]) {
                    dup += array[i] + " ";
                    break;
                }
            }
        }
        if (dup.equals("")) {
            System.out.println("No duplicate numbers found.");
        } else {
            System.out.println("Duplicate numbers: " + dup);
        }
    }
}
