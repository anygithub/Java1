/**
/**
 * Java1. Homework6
 *
 * @author Anna Bondarenko
 * @version date 01.02.19
 */
public class Cat extends Animal {
    private static final double maxRunDistance = 200;
    private static final double maxSwimDistance = 0;
    private static final double maxjumpHeight = 2;

    /**
     * Constructor for Cat with preset default values of runDistance,swimDistance,jumpHeight
     *
     * @param name - cat's name
     */
    public Cat (String name) {
        super (name, maxRunDistance, maxSwimDistance, maxjumpHeight);
    }


    /**
     *
     * @param distance
     * @return false for Cat object
     */
    @Override
    public String swim(double distance) {
        return "swim: false";
    }

}
