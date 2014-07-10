/**
 * Created by Bartek on 2014-07-10.
 */
public class Main {

    public static void main(String[] args) {

        Employee one = new Employee("Jan", "Kowalski");
        System.out.println("Employee one to: " + one.name + " " + one.surname);

        Employee two = new Employee("Marian", "Kolski", 23, 4300);
        System.out.println("Employee two to: " + two.name + " " + two.surname + " lat " + two.age + " i zarabiający " + two.salary + " PLN");

        Employee three = new Employee("Ryszard", 33);
        System.out.println("Employee three to: " + three.name + " lat " + two.age);

    }
}
