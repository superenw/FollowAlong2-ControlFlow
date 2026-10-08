package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Reminder: if / else if / else — part 06 (video: https://www.youtube.com/watch?v=xk4_1vDrzzo)
//
// SECTION D — Challenge. Two small methods. A test checks them: src/test/java/part09/ChallengeTest.java
// Run the test with the green arrow next to "class ChallengeTest". Do NOT change the test.
//
// Each method already has its top line. The inputs are in the parentheses.
// Replace the line marked YOUR CODE so the method returns the right answer.

public class Challenge {

    // The price of a movie ticket, in dollars.
    //   Younger than 5            -> 0  (free)
    //   65 or older               -> 5
    //   a student (any other age) -> 7
    //   everyone else             -> 10
    // ticketPrice(3, false)  should return 0
    // ticketPrice(70, true)  should return 5   (age rules come first)
    // ticketPrice(19, true)  should return 7
    // ticketPrice(30, false) should return 10
    public static int ticketPrice(int age, boolean student) {
        // Checks first if the person is younger than 5
        if (age < 5) {
            // Returns 0 because children younger than 5 get in free
            return 0;
            // Checks if the person is 65 or older
        } else if (age >= 65) {
            // Returns the senior ticket price
            return 5;
            // Checks if the person is a student after the age rules are checked
        } else if (student) {
            // Returns the student ticket price
            return 7;
            // Runs if none of the earlier conditions were true
        } else {
            // Returns the regular ticket price
            return 10;
        }
    }
    // The letter grade for a score.
    //   90 or more -> "A"    80 or more -> "B"    70 or more -> "C"
    //   60 or more -> "D"    anything lower -> "F"
    // letterGrade(95) should return "A"
    // letterGrade(80) should return "B"
    // letterGrade(59) should return "F"
    public static String letterGrade(int score) {
        // Checks first if the score is 90 or higher
        if (score >= 90) {
            // Returns an A for scores of 90 or higher
            return "A";
            // Checks if the score is 80 or higher
        } else if (score >= 80) {
            // Returns a B for scores from 80 to 89
            return "B";
            // Checks if the score is 70 or higher
        } else if (score >= 70) {
            // Returns a C for scores from 70 to 79
            return "C";
            // Checks if the score is 60 or higher
        } else if (score >= 60) {
            // Returns a D for scores from 60 to 69
            return "D";
            // Runs if the score is below 60
        } else {
            // Returns an F for scores below 60
            return "F";
        }
    }
}