package Chapter03;

import java.util.Scanner;

/**
 * Determines the relationship between two numbers and divides if possible
 *
 * @author Yorke Ferrell
 */
public class P3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        if (first < second) {
            System.out.println("The first number is less than the second.");
        }
        if (first > second) {
            System.out.println("The first number is greater than the second.");
        }
        if (first == second) {
            System.out.println("The first number is equal to the second.");
        }
        if (first < second) {
            System.out.println("The first number is less than or equal to the second.");
        }
        if (first != second) {
            System.out.println("The first number is not equal to the second.");
        }

        if (second == 0) {
            System.out.println("Cannot divide by zero");
        } else if (first / second < 1) {
            System.out.println("Proper  fraction");
        } else {
            System.out.println("Improper  fraction");
        }

        if (first >= 90) {
            System.out.println("A");
        } else if (first >= 80) {
            System.out.println("B");
        } else if (first >= 70) {
            System.out.println("C");
        } else if (first >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (second >= 1 && second <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
