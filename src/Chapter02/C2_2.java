package Chapter02;

import java.util.Scanner;

/**
 * Determines the interest based off of given values of balance and interest
 * rate
 *
 * @author Yorke Ferrell
 */
public class C2_2 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double interest = balance * (interestRate / 1200);
        System.out.println("The interest is " + interest);
    }
}
