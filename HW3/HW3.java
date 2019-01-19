/**
 * Java1. Homework3
 *
 * @author Anna Bondarenko
 * @version date 
*/

import java.util.Scanner;

class HW3 {
    public static void main (String[] args) {
        inputNumber(1,9);
        //compareNumbers()
    }

    /**
     * Method requests to input random number from the range.
     */
    public static int inputNumber(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number in a range from " + min + " to " + max + ": ");
        return sc.nextInt();
    }

    /**
     * Method generates random number.
     * @param min - lower number of the range
     * @param max - higher number of the range
     */
    /*static int generateRandomNumber(int min, int max) {
        //Random rand = new Random();
        return 0;//(min + rand.nextInt(max + 1));
    }

    /**
     * Compare two numbers.
     * @param num1 - integer number
     * @param num2 - integer number
     */
    /*static String compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return ("Your number is greater then specified number");
        } else if (num1 < num2) {
            return ("Your number is less then specified number");
        } else {
            return ("Congratulations! You guessed the number.");
        }
    } */


}