/**
 * Java1. Homework5
 *
 * @author Anna Bondarenko
 * @version date 25.01.19
 */


public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    /**
     * Constructor for Employee class
     * @param name - frist name, last name, patronymic of the employe
     * @param position - position in the firm
     * @param email - email of the employee
     * @param phone - work phone number
     * @param salary - salary of the employee
     * @param age - age of the employee
     */
    Employee (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Get employee's name
     * @return name of the employee
     */
    String getName() {
        return this.name;
    }

    /**
     * Set employee's name
     * @param name - name of the employee
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * Get employee's position
     * @return position of the employee
     */
    String getPosition() {
        return this.position;
    }

    /**
     * Set employee's position
     * @param position - position of the employee
     */
    void setPosition(String position) {
        this.position = position;
    }

    /**
     * Get employee's email
     * @return email of the employee
     */
    String getEmail() {
        return this.email;
    }

    /**
     * Set employee's email
     * @param email - email of the employee
     */
    void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get employee's phone
     * @return work phone of the employee
     */
    String getPhone() {
        return this.phone;
    }

    /**
     * Set employee's phone
     * @param phone - work phone of the employee
     */
    void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Get employee's salary
     * @return salary of the employee
     */
    int getSalary() {
        return this.salary;
    }

    /**
     * Set employee's salary
     * @param salary - salary of the employee
     */
    void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Get employee's age
     * @return age of the employee
     */
    int getAge() {
        return this.age;
    }

    /**
     * Set employee's age
     * @param age - age of the employee
     */
    void setAge(int age) {
        this.age = age;
    }

    /**
     * Get string with all information about the employee
     * @return string with information about employee
     */
    @Override
    public String toString () {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}