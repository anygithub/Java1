/**
 * Java1. Homework3_task2
 *
 * @author Anna Bondarenko
 * @version date 
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class HW3_task2 {
    public static void main (String[] args) {
        runGameGuessWord();
    }

    /**
     * Gets user word.
     */
    static String getUserWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input word: ");
        return sc.nextLine();
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
     * Compare two words
     * @param word1 - first word
     * @param word2 - second word
     * @param result - second word
    */
    static boolean compareWords(String word1, String word2, char[] result) {
        boolean flag = true;

        int len = (word1.length() <= word2.length())? word1.length(): word2.length();
        for (int i = 0; i < len; i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                result[i] = word1.charAt(i);
            } else {
                result[i] = '#';
                flag = false;
            }
        }

        return flag;
    }
    
    
    /**
     *Add # simbols to make result lenght 15.
     * @param result - massive of char which contains result
     * @param len - length of result array
     */
    static void addMask(char[] result, int len) {
        for (int i = len; i < (15 - len); i++) {
            result[i] = '#';
        }
    }
    
    //Print the result
    static void printResult(char[] result, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(result[i]);
        }
    }
    
    
    static void tryAgain(String word1, String word2, char[] result) {
        int len = (word1.length() <= word2.length())? word1.length(): word2.length();
        
        if (compareWords(word1,word2,result)) {
            printResult(result,word1.lenght);
        } else {
            
            addMask(result,len);
            printResult(result,15);
        }
    }

    /**
     * Start game 'Guess the word'.
     */
    static void runGameGuessWord() {
        char[] result = new char[15];
        String[] words = fillArray();
        int index = selectRandomWord(words);
        System.out.println(words[index]);
        
        tryAgain(words[index],getUserWord, result);
        //System.out.println();
        //System.out.println(Arrays.toString(words));
    }
}