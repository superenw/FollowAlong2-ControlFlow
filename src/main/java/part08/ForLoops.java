package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s
//        starts at 1:32:37 — stop at about 1:36:20, before "if you would like a copy"
// Guide: GUIDE.md in this folder, steps 1–5
//
// Part 08 — for loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ForLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// Declares a public class named ForLoops
public class ForLoops {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Starts a for loop at 10, repeats while i is at least 0, and decreases i by 1 each time
        for(int i = 10; i >= 0; i--) {
            // Prints the current value of i to the console
            System.out.println(i);
        }
        // Prints "Happy New Year" after the loop finishes
        System.out.println("Happy New Year");
    }
}