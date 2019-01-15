/**
 * Java1. Homework2
 *
 * @author Anna Bondarenko
 * @version date 
*/
import java.util.Arrays;

class HW2 {

    public static void main(String[] args) {
        //call task1
        replaceZerosAndOnes();

        //call task2
        createArray();
    }

    // Method wich replace 0 by 1 and 1 by 0 in array
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

    //Create array with length 8 and fill it
    public static void createArray() {
        int [] ar = new int [8];
        for (int i = 0; i < 8; i++) {
            ar [i] = i*3;
        }
        System.out.println(Arrays.toString(ar));
    }

}