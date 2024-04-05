import java.util.Scanner;

public class PotatoChipBag {
    private static final double REGULAR_WEIGHT = 9.25;
    private static final double LARGE_WEIGHT = 15.75;

    public boolean isBagCorrectWeight(int bagSize, double actualWeight) {
        double expectedWeight = 0;

        if (bagSize == 1) {
            expectedWeight = REGULAR_WEIGHT;
        } else if (bagSize == 2) {
            expectedWeight = LARGE_WEIGHT;
        } else {
            System.out.println("Error: Invalid bag size entered.");
            return false;
        }

        if (Math.abs(actualWeight - expectedWeight) >= 0.01) {
            return false; // Bad bag
        } else {
            return true; // Good bag
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PotatoChipBag potatoChipBag = new PotatoChipBag();
        int goodBags = 0;
        int badBags = 0;
        int totalBags = 0;
        String continueInput = "yes";

        while (continueInput.equalsIgnoreCase("yes")) {
            System.out.println("Enter bag size:");
            System.out.println("1 for regular size");
            System.out.println("2 for large size");
            int bagSize = scanner.nextInt();

            System.out.println("Enter actual weight:");
            double actualWeight = scanner.nextDouble();

            if (potatoChipBag.isBagCorrectWeight(bagSize, actualWeight)) {
                goodBags++;
            } else {
                badBags++;
            }
            totalBags++;

            System.out.println("Continue? (yes/no)");
            continueInput = scanner.next();
        }

        System.out.println("Good Bag: " + goodBags);
        System.out.println("Bad Bag: " + badBags);
        System.out.println("Total Bags: " + totalBags);

    }
}
