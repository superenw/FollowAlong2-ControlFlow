package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5302s
//        while loops start at about 88:22 — stop at about 91:54
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 07 — while loops and do-while loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WhileLoops.
//    Leave the "package part07;" line and the "public class WhileLoops" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// If your program never stops: click the red square (Stop) in the Run window.

// Imports the Scanner class so the program can read user input
import java.util.Scanner;
// Declares a public class named WhileLoops
public class WhileLoops {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Creates a Scanner object that reads input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Declares a String variable named name and starts it as an empty String
        String name = "";
        // Starts a do-while loop that runs at least once
        do {
            // Asks the user to enter their name
            System.out.println("Enter your name: ");
            // Reads the user's input and stores it in the name variable
            name = scanner.nextLine();
            // Repeats the loop while the name is blank
        } while(name.isBlank());
        // Prints a greeting using the name entered by the user
        System.out.println("Hello "+name);
    }
}