package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        logical operators start at about 81:35, while loops at about 89:11
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Two small problems. A test checks them for you:
// src/test/java/part07/ChallengeTest.java
//
// The top line of each problem is given to you. The inputs are already in the
// variables inside the ( ). Replace ONLY the line marked YOUR CODE.
// Your answer goes after the word return. You may add more lines above it.
public class Challenge {
    // Problem 1 — canPlay
    // You can play video games if your homework is done OR it is the weekend,
    // AND the hour is from 8 up to (but not including) 21.
    public static boolean canPlay(boolean homeworkDone, boolean isWeekend, int hour) {
        // Returns true if homework is done OR it is the weekend,
        // AND the time is from 8 through 20
        return (homeworkDone || isWeekend) && hour >= 8 && hour < 21;
    }
    // Problem 2 — digitCount
    // Returns the number of digits in n
    public static int digitCount(int n) {
        // Starts at 1 because even 0 and single-digit numbers have one digit
        int count = 1;
        // Keeps looping while n has more than one digit
        while (n >= 10) {
            // Divides by 10 to remove the last digit
            n = n / 10;
            // Adds one for each digit that was removed
            count++;
        }
        // Returns the total number of digits
        return count;
    }
}