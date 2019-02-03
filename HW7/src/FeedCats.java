/**
 * Java1. Homework7
 *
 * @author Anna Bondarenko
 * @version date 03.02.19
 */

public class startFeedTheCat {
    public static void main(String[] args) {
        //Declaration of objects
        Cat[] cats = new Cat[5];
        Plate plate = new Plate(25);

        fillArray(cats);
        feedCats(cats, plate);

        //Print results
        printArray(cats);
        System.out.println(plate);

    }

    /**
     * Fill array of cats
     * @param cats name of the array
     */
    static void fillArray(Cat[] cats) {
        cats[0] = new Cat("Barsik", 10);
        cats[1] = new Cat("Masya", 18);
        cats[2] = new Cat("Murka", 6);
        cats[3] = new Cat("Max", 10);
        cats[4] = new Cat("Mittens", 8);
    }

    /**
     * Print all cats from array
     * @param cats - array of cats
     */
    static void printArray(Cat[] cats) {
        for (Cat cat: cats) {
            System.out.println(cat.toString());
        }
    }

    /**
     * Feed cats with the food from the palate
     * @param cats - name of array of cats
     * @param plate - name of plate
     */
    static void feedCats(Cat[] cats, Plate plate ) {
        for (Cat cat:cats) {
            cat.eat(plate);
        }
    }
}
