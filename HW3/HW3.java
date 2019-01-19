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
        runGame(byte option, int min, int max);
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
    static byte compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            
            return 1;
        } else if (num1 < num2) {
            return 2;
        } else {
            return 3;
        }
    } 

    /**
     * Ask user to play or not to play.
     * @param option - '1' continue the game; '0' stop the game;
     */
    static byte playAgain(byte option) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Play again? (1 - Yes; 0 - No)");
        return sc.nextByte();
    }
    
    /**
     * Runs tha game where computer generates random number and user have 3 attempts to gues it.
     * @param res - byte number
     */
    static void printResult(byte res) {
        switch (res){
            case 1: System.out.println("Your number is greater then specified number");
            case 2: System.out.println("Your number is lower then specified number");
            case 3: System.out.println("Congratulations! You guessed the number.");
        }
        
    }

    /**
     * Runs tha game where computer generates random number and user have 3 attempts to gues it.
     * @param option - '1' continue the game; '0' stop the game;
     * @param min - lower number of the range
     * @param max - higher number of the range
     */
    static void runGame(byte option, int min, int max) {
        byte i = 1;
        byte res;

        while(option == 1) {
            res = compareNumbers(inputNumber(min,max),generateRandomNumber(min,max));
            i++;
            if ((i == 3)|res == 3) {
                option = playAgain(); 
            }
        }
    }

}