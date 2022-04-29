// my first game Random Points
// earn points by guessing a number > mine
// v2 will be guessing my number, the closer the more points earned
// random cite: https://www.geeksforgeeks.org/generating-random-numbers-in-java/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int ptMine = 0, ptYours = 0, numInput = 1, result = 0;
        int randomNum;

        System.out.println("=============");
        System.out.println("Random points");
        System.out.println("=============");
        System.out.println("Earn points by guessing a number > mine (between 1-10 please)\n");

        while (numInput != 0) {
            System.out.print("Enter a number, 0 to exit: ");
            randomNum = rand.nextInt(11);
            numInput = scanner.nextInt();
            if (numInput < 0 || numInput > 10) {
                System.out.println("Between 1-10 please!");
            } else if (numInput != 0) {
                result = numInput > randomNum ? ++ptYours : ++ptMine;
                System.out.println("Your points: " + ptYours + "; My number " + randomNum + ", my points: " + ptMine);
            }
        }

        System.out.println("=======");
        System.out.println("Summary");
        System.out.println("=======");
        System.out.println("Yours: " + ptYours + "; Mine: " + ptMine);

        if (ptMine > ptYours) {
            System.out.println("I won!");
        } else if (ptMine < ptYours) {
            System.out.println("You won!");
        } else {
            System.out.println("I call this a tie!");
        }
    }
}