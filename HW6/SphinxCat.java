/**
 * Java1. Homework6
 *
 * @author Anna Bondarenko
 * @version date 01.02.19
 */

public class SphinxCat extends Cat{

    /**
     * Constructor for SphinxCat with preset default values of runDistance,swimDistance,jumpHeight
     * @param name - cat's name
     */
    public SphinxCat(String name) {
        super(name);
        this.setRunDistance(100);
        this.setJumpHeight(1.7);
    }
}
