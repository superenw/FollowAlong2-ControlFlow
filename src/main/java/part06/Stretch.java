package part06;

import java.util.Scanner;

public class Stretch {

    public static void main(String[] args) {

        /* MY GUESS:
           C or better
           Medium
           Hard
        */

        // Stretch A
        int score = 85;

        if (score >= 70) {
            System.out.println("C or better");
        } else if (score >= 80) {
            System.out.println("B or better");
        } else {
            System.out.println("Below C");
        }
        int level = 2;
        switch (level) {
            case 1:
                System.out.println("Easy");
            case 2:
                System.out.println("Medium");
            case 3:
                System.out.println("Hard");
                break;
            default:
                System.out.println("Unknown");
        }
        // Stretch B1
        int temperature = 72;

        if (temperature >= 80) {
            System.out.println("Shorts weather");
        } else if (temperature >= 60) {
            System.out.println("Hoodie weather");
        } else {
            System.out.println("Coat weather");
        }
        // Stretch B2
        int month = 4;

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;

            default:
                System.out.println("That is not a month");
        }
        // Stretch B3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Battery percent:");
        int battery = scanner.nextInt();
        if (battery < 20) {
            System.out.println("Low battery. Go charge!");
        } else if (battery < 80) {
            System.out.println("Battery OK");
        } else {
            System.out.println("Fully charged");
        }
        scanner.close();
    }
}