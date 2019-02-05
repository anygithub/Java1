/**
 * Java1. Homework6
 *
 * @author Anna Bondarenko
 * @version date 01.02.19
 */

public class GermanShepherd extends Dog {
    /**
     * Constructor for GermanShepherd with preset default values of runDistance,swimDistance,jumpHeight
     *
     * @param name - dog's name
     */
    public GermanShepherd(String name) {
        super(name);
        this.setRunDistance(600);
        this.setSwimDistance(15);
        this.setJumpHeight(0.7);
    }
}
