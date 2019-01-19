/**
 * Java1. Homework3
 *
 * @author Anna Bondarenko
 * @version date 
*/

import java.util.Scanner;
import java.util.Random;

class HW3 {
    public static void main (String[] args) {
        
        //
    }

    /**
     * Method requests to input random number from the range.
     * @param min - lower number of the range
     * @param max - higher number of the range
     */
    static int inputNumber(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number in a range from " + min + " to " + max + ": ");
        return sc.nextInt();
    }

    /**
     * Method generates random number.
     * @param min - lower number of the range
     * @param max - higher number of the range
     */
    static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return (min + random.nextInt(max + 1));
    }

    /**
     * Compare two numbers.
     * @param num1 - integer number
     * @param num2 - integer number
     */
    static String compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return ("Your number is greater then specified number");
        } else if (num1 < num2) {
            return ("Your number is less then specified number");
        } else {
            return ("Congratulations! You guessed the number.");
        }
    } 

    /**
     * Runs tha game where computer generates random number and user have 3 attempts to gues it.
     * @param option - '1' continue the game; '0' stop the game;
     */
    static playAgain(byte option) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Play again? (1 - Yes; 0 - No)");
        option = sc.nextByte();
    }

    /**
     * Runs tha game where computer generates random number and user have 3 attempts to gues it.
     * @param option - '1' continue the game; '0' stop the game;
     */
    static void runGame(byte option) {
        byte i = 1;
        
        while(option == 1) {
            compareNumbers(inputNumber(1,9),generateRandomNumber(1,9));
            i++;
            playAgain(); //&???
        }
    }

}