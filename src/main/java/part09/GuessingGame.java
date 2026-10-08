package part09;

// Imports Scanner so the program can read the player's guesses
import java.util.Scanner;

// Imports Random so the computer can choose a random secret number
import java.util.Random;

// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

// Declares a public class named GuessingGame
public class GuessingGame {

    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {

        // Creates a Scanner object to read numbers typed by the player
        Scanner scanner = new Scanner(System.in);

        // Creates a Random object to generate the secret number
        Random random = new Random();

        // Generates a random number from 1 to 100 and stores it in secret
        int secret = random.nextInt(100) + 1;

        // Stores the player's current guess and starts it at 0
        int guess = 0;

        // Keeps track of how many guesses the player makes
        int guesses = 0;

        // Tells the player the range of the secret number
        System.out.println("I'm thinking of a number between 1 and 100.");

        // Keeps repeating while the player's guess is not the secret number
        while (guess != secret) {

            // Asks the player for a guess without moving to a new line
            System.out.print("Your guess: ");

            // Reads the player's guess and stores it in guess
            guess = scanner.nextInt();

            // Adds one to the number of guesses
            guesses++;

            // Checks if the player's guess is greater than the secret number
            if (guess > secret) {

                // Tells the player that the guess was too high
                System.out.println("Too high!");

                // Checks if the player's guess is less than the secret number
            } else if (guess < secret) {

                // Tells the player that the guess was too low
                System.out.println("Too low!");
            }
        }

        // Tells the player they guessed correctly and shows the number of guesses
        System.out.println("Correct! You got it in " + guesses + " guesses.");

        // Closes the Scanner after the game is finished
        scanner.close();
    }
}