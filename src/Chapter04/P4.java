package Chapter04;

import java.util.Scanner;

/**
 * Simulates a bidding war for two people applying for work
 *
 * @author Yorke Ferrell
 */
public class P4 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The details asked for below concern the first bidder");
        System.out.print("Name: ");
        String name1 = input.next();
        System.out.print("Hours: ");
        int hours1 = input.nextInt();
        System.out.print("Rate per hour: $");
        double rate1 = input.nextDouble();

        System.out.println("The details asked for below concern the second bidder");
        System.out.print("Name: ");
        String name2 = input.next();
        System.out.print("Hours: ");
        int hours2 = input.nextInt();
        System.out.print("Rate per hour: $");
        double rate2 = input.nextDouble();

        double cost1 = hours1 * rate1;
        double cost2 = hours2 * rate2;

        if (cost1 < cost2) {
            System.out.printf("\n---Bid Winner---");
            System.out.printf("\nWinner: %s", name1);
            System.out.printf("\nTotal cost: $%.2f", cost1);
            System.out.println("");
        } else if (cost1 > cost2) {
            System.out.printf("\n---Bid Winner---");
            System.out.printf("\nWinner: %s", name2);
            System.out.printf("\nTotal cost: $%.2f", cost2);
            System.out.println("");
        } else if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("\n---Bid Winner---");
            System.out.printf("\nWinner: %s", name1);
            System.out.printf("\nTotal cost: $%.2f", cost1);
            System.out.printf("\nHours: %d", hours1);
            System.out.println("");
        } else if (cost1 == cost2 && hours1 > hours2) {
            System.out.printf("\n---Bid Winner---");
            System.out.printf("\nWinner: %s", name2);
            System.out.printf("\nTotal cost: $%.2f", cost2);
            System.out.printf("\nHours: %d", hours2);
            System.out.println("");
        } else if (cost1 == cost2 && hours1 == hours2) {
            System.out.printf("\nBoth %s and %s have identical bids with %d hours at a rate of $%.2f", name1, name2, hours1, cost1);
            System.out.println("");
        }
    }
}
