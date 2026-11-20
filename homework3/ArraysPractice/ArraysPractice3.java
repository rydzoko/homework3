package ArraysPractice;

public class ArraysPractice3 {
    public static void main(String[] args) {
        int[] someArray = {43,6,21,2,-1,32};
        int sum=0;
        
        int i=0;
        for (; i<someArray.length; i++) {
            sum += someArray[i];
        }
        
        System.out.println("Array: ");
        i=0;
        for (;i<someArray.length;i++){
            System.out.print(someArray[i]+" ");
        }

        double avg = (sum/i);
        int abAvg=0;
        System.out.println("\nAverage: "+avg);
        i=0;
        for (;i<someArray.length;i++) {
            if (someArray[i]>avg) {
                abAvg++;
            }
        }
        System.out.println("Numbers above the average value: "+abAvg);
        
        
    }
    
}
