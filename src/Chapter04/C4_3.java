package Chapter04;

import java.util.Scanner;

/**
 * Determines working information after input of nessecary info
 *
 * @author Yorke Ferrell
 */
public class C4_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federal = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double state = input.nextDouble();

        double grossPay = hours * rate;
        double federalTax = federal * grossPay;
        double stateTax = state * grossPay;
        double totalDeduction = federalTax + stateTax;
        double netPay = grossPay - totalDeduction;

        System.out.printf("\nEmployee Name: %s", name);
        System.out.printf("\nHours Worked: %.2f", hours);
        System.out.printf("\nPay Rate: %.2f", rate);
        System.out.printf("\nGross Pay: %.2f", grossPay);
        System.out.printf("\nDeductions");
        System.out.printf("\n\tFederal Withholding (%.2f%%): %.2f", (federal * 100), federalTax);
        System.out.printf("\n\tState Withholding (%.2f%%): %.2f", (state * 100), stateTax);
        System.out.printf("\n\tTotal Deduction: %.2f", totalDeduction);
        System.out.printf("\nNet Pay: %.2f", netPay);
        System.out.println("");
    }
}
