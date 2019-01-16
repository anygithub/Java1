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
        //Initialization of arrays for task6
        int[] a1 = {1,1,1,2,1};
        int[] a2 = {2,1,1,2,1};
        int[] a3 = {10,10};
        int[] a4 = {1,1,1,1,4};
        int[] a5 = {5,6,7,3};
        //Initialization of arrays for task7
        int[] a6 = {1,2,3,4,5,6};
        int[] a7 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int[] a8 = {1,2,3};
        int[] a9 = {1,2,3,4,5,6,7};

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

        //call task6
        System.out.println(checkBalance(a1));
        System.out.println(checkBalance(a2));
        System.out.println(checkBalance(a3));
        System.out.println(checkBalance(a4));
        System.out.println(checkBalance(a5));

        //call task7
        moveArrayElements(a6,2);
        moveArrayElements(a7,-4);
        moveArrayElements(a8,15);
        moveArrayElements(a9,0);
    }

    /**
     * Method creates array. Replaces 0 by 1 and 1 by 0.
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
     * Method creates array with length 8 and fill it
     */
    public static void createArray() {
        int[] ar = new int[8];
        for (int i = 0; i < 8; i++) {
            ar[i] = i*3;
        }
        System.out.println(Arrays.toString(ar));
    }

    /**
     * Method creates array and multiple each element which is lower then 6 on 2
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
     * Method creates two-dimensional array and fills diagonal elements with 1
     * @param n - array length
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

    /**
     * Method checks if there a place in the array where sum of right elements equals sum of left elements.
     * @return true in case if there is such place in the array.
     * @param arr[] array of integer numbers
     */
    public static boolean checkBalance(int arr[]) {
        int l = arr.length;
        int leftSum = 0;
        int righSum = 0;

        for (int i = 0; i < l - 1; i++) {
            leftSum += arr[i];
            for (int j = l - 1; j > i; j--) {
                righSum += arr[j];
            }
            if (leftSum == righSum) {
                return true;
            } else {
                righSum = 0;
            }
        }
        return false;
    }

    /**
     * Method moves all elements in array on selected numberber of positions.
     * @param arr[] array of the integer numbers
     * @param s number of positions
     */
    public static void moveArrayElements(int arr[], int s) {
        int temp;
        int l = arr.length;

        if (s > 0) {
            if (s > l) {s = s % l;}
            for (int i = 0; i < s; i++) {
                temp = arr[l - 1];
                for (int j = l - 1; j > 0; j--) {
                    arr[j] = arr [j - 1];
                }
                arr[0] = temp;
            }
        } else if (s < 0){
            s = Math.abs(s);
            if (s > l) {s = s % l;}
            for (int p = 0; p < s; p++) {
                temp = arr[0];
                for (int k = 0; k < l - 1; k++) {
                    arr[k] = arr[k+1];
                }
                arr[l-1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}