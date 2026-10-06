package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4161s
//        if statements start at about 69:21, switches at about 76:36
// Guide: GUIDE.md in this folder, steps 2–5 (if) and 7–10 (switch)
//
// SECTION D — Challenge. Two small problems. A test checks them for you:
// src/test/java/part06/ChallengeTest.java
//
// For each problem: the top line is given to you. The inputs are already in the
// variables inside the ( ). Replace ONLY the line marked YOUR CODE.
// Your answer goes after the word return.

public class Challenge {

    // Problem 1 — canCharge
    public static boolean canCharge(int battery, boolean docked) {

        if (docked && battery < 100) {
            return true;
        } else {
            return false;
        }
    }

    // Problem 2 — dayType
    public static String dayType(int day) {

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return "weekday";

            case 6:
            case 7:
                return "weekend";

            default:
                return "invalid";
        }
    }
}