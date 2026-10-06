package part06;

// Video: [https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s]
//        if statements start at about 68:48 — stop at about 74:54
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 06 — if, else if, else
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called IfStatements.
//    Leave the "package part06;" line and the "public class IfStatements" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

// Declares a public class named IfStatements
public class IfStatements {

    // Defines the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Declares an integer variable named age and gives it the value 70
        int age = 70;
        // Checks whether age is exactly equal to 100
        if (age == 100) {
            // Prints this message if age equals 100
            System.out.println("You are 100 years old?!");
        }
        // Checks whether age is at least 75 if the first condition was false
        else if (age>=75) {
            // Prints this message if age is 75 or older
            System.out.println("You are an old person!");
        }
        // Checks whether age is at least 18 if the earlier conditions were false
        else if(age>=18){
            // Prints this message if age is 18 or older
            System.out.println("You are an adult!");
        }
        // Checks whether age is at least 13 if the earlier conditions were false
        else if(age>=13){
            // Prints this message if age is between 13 and 17
            System.out.println("You are a teenager!");
        }
        // Runs if none of the previous if or else-if conditions were true
        else {
            // Prints this message if age is less than 13
            System.out.println("You are not an adult!");
        }
    }
}