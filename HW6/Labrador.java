/**
 * Java1. Homework6
 *
 * @author Anna Bondarenko
 * @version date 01.02.19
 */

public class Labrador extends Dog {
    /**
     * Constructor for Labrador with preset default values of runDistance,swimDistance,jumpHeight
     *
     * @param name - dog's name
     */
    public Labrador(String name) {
        super(name);
        this.setRunDistance(550);
        this.setSwimDistance(20);
        this.setJumpHeight(0.4);
    }
}
