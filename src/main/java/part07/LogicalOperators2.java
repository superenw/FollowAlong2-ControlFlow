package part07;

// Imports Scanner so the program can read input from the user
import java.util.Scanner;

// Declares a public class named LogicalOperators2
public class LogicalOperators2 {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Creates a Scanner object that reads input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prints instructions telling the user how to quit the game
        System.out.println("You are playing the game, press q or Q to quit.");
        // Reads the user's input and stores it in the response variable
        String response = scanner.next();
        // Checks if the user entered either lowercase q OR uppercase Q
        if(response.equals("q") || response.equals("Q")) {
            // Prints this message if the user chose to quit
            System.out.println("You quit the game.");
        }
        // Runs if the user did not enter q or Q
        else {
            // Prints this message if the user is still playing
            System.out.println("You are still playing the game.");
        }

    }
}