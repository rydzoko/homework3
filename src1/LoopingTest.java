public class LoopingTest {
    public static void main(String[] args) throws Exception {
    
        int count = 1;
        while (count <= 3) {
            System.out.println("Loop is currently running! Count is: " + count);
            count = count + 1;
        }

        System.out.println("Loop finished!");
    }
}