import java.util.Scanner;
import java.util.Random;

public class Guessmynum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;
        System.out.println("Welcome to the Guess My Number game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
