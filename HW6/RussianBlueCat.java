/**
 * Java1. Homework6
 *
 * @author Anna Bondarenko
 * @version date 01.02.19
 */

public class RussianBlueCat extends Cat {

    /**
     * Constructor for RussianBlueCat with preset default values of runDistance,swimDistance,jumpHeight
     * @param name - cat's name
     */
    public RussianBlueCat(String name) {
        super(name);
        this.setRunDistance(150);
        this.setJumpHeight(2.3);
    }
}
