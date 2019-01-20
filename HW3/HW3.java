/**
 * Java1. Homework3
 *
 * @author Anna Bondarenko
 * @version date 20.01.19
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class HW3 {
    public static void main (String[] args) {
        //call task1
        //runGameGuessNumber(1,0,9);

        //call task2
        //System.out.println(Arrays.toString(fillArray()));
        //System.out.println(selectRandomWord(fillArray()));
        runGameGuessWord();
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
        int t = min + random.nextInt(max + 1);
        System.out.println (t);
        return (t);
    }

    /**1
     * Compare two numbers.
     * @param num1 - integer number
     * @param num2 - integer number
     */
    static int compareNumbers(int num1, int num2) {
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
     */
    static int playAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Play again? (1 - Yes; 0 - No)");
        return sc.nextInt();
    }
    
    /**
     * Runs tha game where computer generates random number and user have 3 attempts to gues it.
     * @param res - int number
     */
    static void printResult(int res) {
        switch (res){
            case 1: 
                System.out.println("Your number is greater then specified number");
                break;
            case 2: 
                System.out.println("Your number is lower then specified number");
                break;
            case 3: 
                System.out.println("Congratulations! You guessed the number.");
                break;
        }
        
    }

    /**
     * Runs the game where computer generates random number and user have 3 attempts to gues it.
     * @param option - '1' continue the game; '0' stop the game;
     * @param min - lower number of the range
     * @param max - higher number of the range
     */
    static void runGameGuessNumber(int option, int min, int max) {
        int i = 1;
        int res;
        int randomNum = generateRandomNumber(min,max);

        while(option == 1) {
            res = compareNumbers(inputNumber(min,max),randomNum);
            printResult(res);
            if ((i == 3)||(res == 3)) {
                option = playAgain();
                if (option == 1) {
                    i = 0;
                    randomNum = generateRandomNumber(min,max);
                } else {
                    break;
                }
            }
            i++;
        }
    }

    /**
     * Fill array with words.
     */
     static String[] fillArray() {
        String[] array = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", 
                            "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", 
                            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        return array;
     }

    /**
     * Select random word from the array.
     * @param array - array of words
     */
    static int selectRandomWord(String[] array) {
        Random random = new Random();
        return (random.nextInt(array.length + 1));
    }

    /**
     * Compare two word.
     * @param word1 - first word
     * @param word2 - second word
     */
    static boolean compareWords(String word1, String word2) {
        char[] result = new char[15];
        boolean flag = true;
        int len = (word1.length() <= word2.length())? word1.length(): word2.length();

        System.out.println(len);
        /*for (int i = 0; i < len; i++){
            if (word1.charAt(i) == word2.charAt(i)) {
                result[i] = word2.charAt(i);
            } else {
                result[i] = '#';
                flag = false;
            }
        }

        if (!flag) {
            for (int j = len; j < 15; j++) {
                result[j] = '#';
            }
        } */

        return flag;
    }

    /**
     * Print correct simbols in the word.
     * @param word - first word
     */
    static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    /**
     * Print correct simbols in the word.
     * @param word - first word
     */
    static void tryAgain(String word1, String word2, boolean flag) {
        while (!flag) {
            flag = compareWords(word1,word2);
        }
    }

    /**
     * Print correct simbols in the word.
     * @param word - first word
     */
    static char[] checkCorrectSimbols(String word1, String word2) {
        int len = (word1.length() <= word2.length())?word1.length():word2.length();
        for (int i = 0; i < len; i++){
            result[i] = (word1.charAt(i) == word2.charAt(i))?word2.charAt(i):'#';
        }
        for (int j = len; j < 15; j++) {
            result[j] = '#';
        }
        return result;
    }

    /**
     * Print correct simbols in the word.
     * @param word - first word
     */
    static String getWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input word: ");
        return sc.nextLine();
    }

    /**
     * Start game 'Guess the word'.
     */
    static void runGameGuessWord() {
        String[] words = fillArray();
        int index = selectRandomWord(words);
        System.out.println(words[index]);
        tryAgain(compareWords(words[index],getWord()));
        //System.out.println();
        //System.out.println(Arrays.toString(words));
    }
}