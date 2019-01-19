/**
 * Java1. Homework3
 *
 * @author Anna Bondarenko
 * @version date 
*/

class HW3 {
    public static void main (String[] args) {
        
    }

    /**
     * Compare two numbers.
     * @param num1 - integer number
     * @param num2 - integer number
     */
    static String compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return "Your number is greater then specified number" ;
        } else if (num1 < num2) {
            return "Your number is less then specified number" ;
        } else {
            return "Congratulations! You guessed the number."
        }
    }

    /**
     * Method generates random number.
     * @param min - lower number of the range
     * @param max - higher number of the range
     */
    static int generateRandomNumber(int min, int max) {
        return Math.random
    }
}