/**
 * Java1. Homework7
 *
 * @author Anna Bondarenko
 * @version date 03.02.19
 */

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    /**
     * Eat the food
     * @param plate - where cat can take food
     */
    public void eat(Plate plate) {
        if ((!this.satiety)&&(this.appetite <= plate.getFood())) {
            plate.decreaseFood(appetite);
            this.appetite = 0;
        }
        this.setSatiety(this.checkSatiety());
    }

    /**
     * Return string with all information about the cat
     * @return name,appetite,satiety of the cat
     */
    @Override
    public String toString() {
        return this.name + ", " + this.appetite + ", is full - " + this.getSatiety();
    }

    /**
     * Check if cat is full
     * @return true if cat's appetite is 0; false in other case;
     */
    public boolean checkSatiety() {
        return (this.appetite == 0);
    }

    /**
     * Get satiety of the cat
     * @return true if cat is full; false if cat is hungry
     */
    public boolean getSatiety() {
        return satiety;
    }

    /**
     * Set satiety of the cat
     * @param satiety
     */
    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

}
