package part08;

import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

// Declares a public class named NestedLoops
public class NestedLoops {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Creates a Scanner object that reads input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Declares an integer variable named rows
        int rows;
        // Declares an integer variable named columns
        int columns;
        // Declares a String variable named symbol and starts it as an empty String
        String symbol = "";
        // Asks the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        // Reads the number entered by the user and stores it in rows
        rows = scanner.nextInt();
        // Asks the user to enter the number of columns
        System.out.print("Enter the number of columns: ");
        // Reads the number entered by the user and stores it in columns
        columns = scanner.nextInt();
        // Asks the user to enter the symbol they want to use
        System.out.print("Enter the symbol to use: ");
        // Reads the symbol entered by the user and stores it in symbol
        symbol = scanner.next();
        // Outer loop repeats once for each row
        for (int i = 1; i <= rows; i++) {
            // Moves to a new line before printing the next row
            System.out.println();
            // Inner loop repeats once for each column
            for (int j = 1; j <= columns; j++) {
                // Prints the chosen symbol without moving to a new line
                System.out.print(symbol);
            }
        }
    }
}