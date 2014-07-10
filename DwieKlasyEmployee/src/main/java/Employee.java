/**
 * Created by Bartek on 2014-07-10.
 */
public class Employee {

    String name;

    String surname;

    int age = 18;

    double salary = 1600;

    public Employee(String eName, String eSurname) {
        this.name = eName;
        this.surname = eSurname;
    }

    public Employee(String eName, int eAge) {
        this.name = eName;
        this.age = eAge;
    }

    public Employee(String eName, String eSurname, int eAge, double eSalary) {
        this.name = eName;
        this.surname = eSurname;
        this.age = eAge;
        this.salary = eSalary;
    }
}
