/**
 * Java1. Homework6
 *
 * @author Anna Bondarenko
 * @version date 01.02.19
 */


/**
 * Super class Animal
 */
abstract class Animal {

    protected String name;
    protected double  runDistance;
    protected double swimDistance;
    protected double jumpHeight;

    /**
     * Constructor for Animal class
     * @param name - name of the animal
     * @param runDistance - maximum distance which animal can run
     * @param swimDistance - maximum distance which animal can swim
     * @param jumpHeight - maximum height which animal can jump on
     */
    public Animal(String name, double runDistance, double swimDistance, double jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
    }

    /**
     * Check if animal can run the distance
     * @param distance - distance to check
     * @return run:true if animal can run the distance
     */
    public String run(double distance) {
        return (runDistance >= distance)?"run: true":"run: false";
    }

    /**
     * Check if animal can swim the distance
     * @param distance - distance to check
     * @return swim:true if animal can swim the distance
     */
    public String swim(double distance) {
        return (swimDistance >= distance)?"swim: true": "swim: false";
    }

    /**
     * Check if animal can jump on the height
     * @param height - height to check
     * @return jump: true if animal can jump on the height
     */
    public String jump(double height) {
        return (jumpHeight >= height)?"jump: true": "jump: false";
    }

    /**
     * Returns
     * @return
     */
    @Override
    public String toString(){
        return name + ", " + runDistance + ", " + swimDistance + ", " + jumpHeight;
    }


    /**
     * Get name
     * @return name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get maximum distance which animal can run
     * @return maximum distance which animal can run
     */
    public double getRunDistance() {
        return runDistance;
    }

    /**
     * Set maximum distance which animal can run
     * @param runDistance
     */
    public void setRunDistance(double runDistance) {
        this.runDistance = runDistance;
    }

    /**
     * Get maximum distance which animal can swim
     * @return maximum distance which animal can swim
     */
    public double getSwimDistance() {
        return swimDistance;
    }

    /**
     * Set maximum distance which animal can swim
     * @param swimDistance
     */
    public void setSwimDistance(double swimDistance) {
        this.swimDistance = swimDistance;
    }

    /**
     * Get maximum height which animal can jump on
     * @return maximum height which animal can jump on
     */
    public double getJumpHeight() {
        return jumpHeight;
    }

    /**
     * Set maximum height which animal can jump on
     * @param jumpHeight
     */
    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }


}
