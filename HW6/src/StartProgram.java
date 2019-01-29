/**
 * Java1. Homework6
 *
 * @author Anna Bondarenko
 * @version date
 */

public class StartProgram {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        fillAnimalsArray(animals);
        //printArray(animals);
        animalRace(animals);
        animalSwim(animals);
        animalJump(animals);
    }

    static void fillAnimalsArray(Animal[] animals) {
        animals[0] = new Cat("Murzik",150,60,2);
        animals[1] = new Cat("Musya",100,0,1.5);
        animals[2] = new Cat("Tuzik",500,8,0.2);
        animals[3] = new Cat("Muhtar",405,10,0.5);
    }

    static void printArray(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    static void animalRace(Animal[] animals) {
        System.out.println("Animal race:");
        for (Animal animal : animals) {
            System.out.println(animal.toString() + " - " + animal.run(120));
        }
    }

    static void animalSwim(Animal[] animals) {
        System.out.println("Animal swim:");
        for (Animal animal : animals) {
            System.out.println(animal.toString() + " - " + animal.swim(5));
        }
    }

    static void animalJump(Animal[] animals) {
        System.out.println("Animal jump:");
        for (Animal animal : animals) {
            System.out.println(animal.toString() + " - " + animal.jump(1.8));
        }
    }

}
