/**
 * Java1. Homework6
 *
 * @author Anna Bondarenko
 * @version date 01.02.19
 */

public class StartProgram {

    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        fillAnimalsArray(animals);

        //Run
        animalRace(animals,100);
        animalRace(animals,150);
        animalRace(animals,200);
        animalRace(animals,600);

        //Swim
        animalSwim(animals, 10);
        animalSwim(animals, 15);
        animalSwim(animals, 1);

        //Jump
        animalJump(animals,0.5);
        animalJump(animals,1);
        animalJump(animals,2);
        animalJump(animals,2.3);

    }

    /**
     * Fill array with values
     * @param animals name of the array
     */
    static void fillAnimalsArray(Animal[] animals) {
        animals[0] = new Cat("Murzik");
        animals[1] = new RussianBlueCat("Musya");
        animals[2] = new SphinxCat("Mitens");
        animals[3] = new Dog("Tuzik");
        animals[4] = new GermanShepherd("Muhtar");
        animals[5] = new Labrador("Rex");
    }


    /**
     * Start run
     * @param animals name of the array
     * @param raceDistance
     */
    static void animalRace(Animal[] animals, double raceDistance) {
        printRaceNameAndDistance("Run", raceDistance);
        for (Animal animal : animals) {
            System.out.println(animal.toString() + " - " + animal.run(raceDistance));
        }
    }

    /**
     * Start animal swim
     * @param animals name of the array
     * @param swimRaceDistance
     */
    static void animalSwim(Animal[] animals, double swimRaceDistance) {
        printRaceNameAndDistance("Swim", swimRaceDistance);
        for (Animal animal : animals) {
            System.out.println(animal.toString() + " - " + animal.swim(swimRaceDistance));
        }
    }

    /**
     * Start animal jump
     * @param animals name of the array
     * @param jumpRaceHeight
     */
    static void animalJump(Animal[] animals, double jumpRaceHeight) {
        printRaceNameAndDistance("Jump", jumpRaceHeight);
        for (Animal animal : animals) {
            System.out.println(animal.toString() + " - " + animal.jump(jumpRaceHeight));
        }
    }

    /**
     * Print race name and race distance
     * @param raceName name of the race
     * @param raceDistance distance of the race
     */
    static void printRaceNameAndDistance(String raceName, double raceDistance) {
        System.out.println("---------------Start " + raceName + " on " + raceDistance +" !!!----------------------");
    }

}
