package Chapter03;

import java.util.Scanner;

/**
 * Performs a match of "Rock, Paper, Scissors"
 *
 * @author Yorke Ferrell
 */
public class C3_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int guess = input.nextInt();
        int computer = (int) (Math.random() * 3);

        switch (guess) {
            case 0:
                if (computer == 0) {
                    System.out.println("The computer is scissor. You are scissor too. It is a draw");
                } else if (computer == 1) {
                    System.out.println("The computer is rock. You are scissor. You lose");
                } else if (computer == 2) {
                    System.out.println("The computer is paper. You are scissor. You won");
                }
                break;
            case 1:
                if (computer == 0) {
                    System.out.println("The computer is scissor. You are rock. You won");
                } else if (computer == 1) {
                    System.out.println("The computer is rock. You are rock too. It is a draw");
                } else if (computer == 2) {
                    System.out.println("The computer is paper. You are rock. You lose");
                }
                break;
            case 2:
                if (computer == 0) {
                    System.out.println("The computer is scissor. You are paper. You lose");
                } else if (computer == 1) {
                    System.out.println("The computer is rock. You are paper. You won");
                } else if (computer == 2) {
                    System.out.println("The computer is paper. You are paper too. It is a draw");
                }
                break;
        }
    }
}
