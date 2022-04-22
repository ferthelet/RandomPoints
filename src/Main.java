// my first game
// also in https://replit.com/@JuanSalazar20/MyFirstGame#Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ptMine = 0, ptYours = 0, numInput = 1, result = 0;
        // fixed to 5 pending random number function
        double numRandom = 5;

        System.out.println("=============");
        System.out.println("Random points");
        System.out.println("=============");
        System.out.println("Earn points by guessing a number > mine (between 1-10 please)\n");

        while(numInput != 0) {
            // pending input control
            System.out.print("Enter a number, 0 to exit: ");
            numInput = scanner.nextInt();
            if (numInput != 0) {
                result = numInput > numRandom ? ++ptYours : ++ptMine;
                System.out.println("Yours: " + ptYours + "; Mine: " + ptMine);
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