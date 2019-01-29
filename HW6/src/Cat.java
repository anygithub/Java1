/**
/**
 * Java1. Homework6
 *
 * @author Anna Bondarenko
 * @version date
 */
public class Cat extends Animal {
    Cat (String name, double runDistance, double swimDistance, double jumpHight ) {
        super (name, runDistance, swimDistance, jumpHight);
    }

    /**
     *
     * @param distance
     * @return false for Cat object
     */
    @Override
    public boolean swim(double distance) {
        return false;
    }
}
