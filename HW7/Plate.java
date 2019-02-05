/**
 * Java1. Homework7
 *
 * @author Anna Bondarenko
 * @version date 03.02.19
 */

public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    /**
     * Decrease amount of food
     * @param food number of food to decrease
     */
    public void decreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food;
        }
    }

    /**
     * Return string with amount of food in the plate
     * @return
     */
    @Override
    public String toString() {
        return "Food: " + food;
    }

    /**
     * Get amount of food in the plate
     * @return
     */
    public int getFood() {
        return food;
    }

    /**
     * Set amount of food in the plate
     * @param food
     */
    public void setFood(int food) {
        this.food = food;
    }
}
