public class Arrays {
    public static void main(String[] args) {
        String[] myHobbies = {"Running", "Studying", "Reading"};
        int[] timeSpendPerDay = {40, 120, 30};

        System.out.println("--- My daily schedule ---");

        for (int i = 0; i < 3; i++) {
            System.out.println("Activity " + (i + 1) + ": I spend " + timeSpendPerDay[i] + " minutes on " + myHobbies[i] + ".");
        }


    }

}