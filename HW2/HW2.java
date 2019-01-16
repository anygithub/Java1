/**
 * Java1. Homework2
 *
 * @author Anna Bondarenko
 * @version date 
*/
import java.util.Arrays;
import java.util.Random;

class HW2 {

    public static void main(String[] args) {
        //call task1
        replaceZerosAndOnes();

        //call task2
        createArray();

        //call task3
        createArrayAndMultipleElements();

        //call task4
        createTwodimensionalArray(5);
        createTwodimensionalArray(10);
        createTwodimensionalArray(4);

       //call task5
       findMaxAndMinElementsInArray(7);
       findMaxAndMinElementsInArray(20);
       findMaxAndMinElementsInArray(4);
    }

    /**
     * Method wich replace 0 by 1 and 1 by 0 in array
     */
    public static void replaceZerosAndOnes() {
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) { 
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Create array with length 8 and fill it
     */
    public static void createArray() {
        int[] ar = new int [8];
        for (int i = 0; i < 8; i++) {
            ar [i] = i*3;
        }
        System.out.println(Arrays.toString(ar));
    }

    /**
     * Create array and multiple each element which is lower then 6 on 2
     */
    public static void createArrayAndMultipleElements() {
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Creates two-dimensional array and fills diagonal elements with 1
     */
    public static void createTwodimensionalArray(int n) {
        int[][] matr = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j)||(i == n - j -1)) {
                    matr[i][j] = 1;
                } 
                System.out.print(matr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Method creates one-dimentional array filled with random numbers. And finds maximal and minimal element.
     * @param dim - dimention of array
     */
    public static void findMaxAndMinElementsInArray(int dim) {
        int[] arr = new int[dim];
        Random random = new Random();
        int min, max;

        //Fill array with random numbers
        for (int i = 0; i < dim; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
        
        //Find minimum and maximum elemnts
        min = arr[0];
        max = arr[0];
        for (int j = 1; j < dim; j++) {
            if (arr[j] < min) {min = arr[j];}
            if (arr[j] > max) {max  = arr[j];}
        }
        System.out.println ("Minimal element - " + min + "     Maximal element - " + max);
    }
}