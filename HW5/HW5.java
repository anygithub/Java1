/**
 * Java1. Homework5
 *
 * @author Anna Bondarenko
 * @version date 25.01.19
 */
import Employee; //Add Employee in the package with HW5

public class HW5 {
    public static void main (String[] args) {
        Employee array[] = new Employee[5];
        fillEmployeeArray(array);
        getEmployeesAfterForty(array);
    }

    /**
     * Print information about employees who is after forty years old
     * @param array - array of employees
     */
    private static void getEmployeesAfterForty(Employee array[]) {
        for (int i = 0; i<array.length; i++) {
            if (array[i].getAge()>40) {
                System.out.println(array[i]);
            }
        }
    }

    /**
     * Fill array of employees
     * @param array - array of employees
     */
    static void fillEmployeeArray (Employee array[]) {
        array[0] = new Employee("Иванов Иван Иванович", "слесарь", "iivanov@mail.com", "808",45000,21);
        array[1] = new Employee("Петров Петр Петрович", "водитель", "ppetrov@mail.com", "901",30000,40);
        array[2] = new Employee("Васечкин Василий Васильевич", "охранник", "vvasiliev@mail.com", "404",20000,60);
        array[3] = new Employee("Сидоров Валентин Георгиевич", "монтажник", "vsidorov.com", "555",39000,41);
        array[4] = new Employee("Павлов Павел Павлович", "администратор", "ppavlov.com", "345",27000,39);
    }
}
