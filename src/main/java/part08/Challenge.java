package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5591s
//        rewatch 1:33:11 (for loops) and 1:38:52 (nested loops) if you get stuck
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Two small methods. A test checks them: src/test/java/part08/ChallengeTest.java
// Run the test with the green arrow next to "class ChallengeTest". Do NOT change the test.
//
// Each method already has its top line. The inputs are in the parentheses.
// Replace the line marked YOUR CODE so the method returns the right answer.

public class Challenge {
    // Repeat word n times, all stuck together.
    // repeatWord("hi", 3)   should return "hihihi"
    // repeatWord("Go", 1)   should return "Go"
    // repeatWord("abc", 0)  should return ""   (zero times = an empty String)
    public static String repeatWord(String word, int n) {
        // Starts with an empty String that will hold the repeated words
        String result = "";
        // Runs the loop n times
        for (int i = 0; i < n; i++) {
            // Adds the word to the end of result each time the loop runs
            result = result + word;
        }
        // Returns the finished String
        return result;
    }
    // Build a triangle of stars with the given number of rows.
    // Row 1 has 1 star, row 2 has 2 stars, and so on. Every row ends with \n.
    // triangle(3) should return "*\n**\n***\n" which prints as:
    //     *
    //     **
    //     ***
    // triangle(0) should return ""
    public static String triangle(int rows) {
        // Starts with an empty String that will hold the whole triangle
        String result = "";
        // Outer loop controls which row is being created
        for (int i = 1; i <= rows; i++) {
            // Inner loop adds the correct number of stars for the current row
            for (int j = 1; j <= i; j++) {
                // Adds one star to the result
                result = result + "*";
            }
            // Adds a newline after each completed row
            result = result + "\n";
        }
        // Returns the completed triangle
        return result;
    }
}