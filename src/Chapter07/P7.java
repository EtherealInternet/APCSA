package Chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class P7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create the array
        System.out.print("How many numbers will be read: ");
        int[] numbers = new int[input.nextInt()];

        fillArray(numbers, input);
        System.out.println("The average is " + average(numbers));
        displayArray(numbers);
    }

    public static void fillArray(int[] numbers, Scanner input) {
        System.out.print("Enter " + numbers.length + " elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }

    public static double average(int[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum / numbers.length;
    }

    public static void displayArray(int[] numbers) {
        System.out.println("The contents of the array: " + Arrays.toString(numbers));
    }
}
