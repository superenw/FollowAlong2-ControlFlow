package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

// Declares a public class named Switches
public class Switches {
    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Declares a String variable named day and gives it the value "Pie"
        String day = "Pie";
        // Starts a switch statement that checks the value stored in day
        switch(day){
            // Checks whether day equals "Sunday" and prints a message if it does
            case "Sunday": System.out.println("It Is Sunday");
                // Stops the switch after the Sunday case runs
                break;
            // Checks whether day equals "Monday" and prints a message if it does
            case "Monday": System.out.println("It Is Monday");
                // Stops the switch after the Monday case runs
                break;
            // Checks whether day equals "Tuesday" and prints a message if it does
            case "Tuesday": System.out.println("It Is Tuesday");
                // Stops the switch after the Tuesday case runs
                break;
            // Checks whether day equals "Wednesday" and prints a message if it does
            case "Wednesday": System.out.println("It Is Wednesday");
                // Stops the switch after the Wednesday case runs
                break;
            // Checks whether day equals "Thursday" and prints a message if it does
            case "Thursday": System.out.println("It Is Thursday");
                // Stops the switch after the Thursday case runs
                break;
            // Checks whether day equals "Friday" and prints a message if it does
            case "Friday": System.out.println("It Is Friday");
                // Stops the switch after the Friday case runs
                break;
            // Checks whether day equals "Saturday" and prints a message if it does
            case "Saturday": System.out.println("It Is Saturday");
                // Stops the switch after the Saturday case runs
                break;
            // Runs when day does not match any of the listed cases
            default: System.out.println("That Is Not A Day.");
        }
    }
}