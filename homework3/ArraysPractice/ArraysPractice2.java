package ArraysPractice;

public class ArraysPractice2 {

    public static void main(String[] args) {
        int[] array8 = {5,2,77,23,6,-9,1,56};
        int larg=0, smal=0, indL=0, indS=0, temp=0;
        //for finding the largest, i temporarely create a temp integer
        for (int i =0;i<array8.length; i++){
            temp = array8[i];
            if (temp>larg){
                larg = temp;
                indL = i;
            }
        }
        //now the same goes for the smallest
        
        for (int i=0;i<array8.length; i++){
            temp=array8[i];
            if (temp <smal){
                smal = temp;
                indS = i;
            }
        }
        System.out.print("Array: ");
        for (int i =0; i<array8.length; i++){
            System.out.print(array8[i]+" ");
        }
        

        System.out.println("\nLargest: "+larg+" ; and its index number is: "+indL);
        System.out.println("Smallest: "+smal+" ; while its index is: "+indS);
    }

    
}
