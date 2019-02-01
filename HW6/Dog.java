/**
 * Java1. Homework6
 *
 * @author Anna Bondarenko
 * @version date 01.02.19
 */

public class Dog extends  Animal{
    private static final double maxRunDistance = 500;
    private static final double maxSwimDistance = 10;
    private static final double maxjumpHeight = 0.5;
    /**
     * Constructor for Dog with preset default values of runDistance,swimDistance,jumpHeight
     *
     * @param name - dog's name
     */
    public Dog(String name) {
        super(name, maxRunDistance, maxSwimDistance, maxjumpHeight);

    }



}
