/**
 * author: Bartek
 */
public class TypyWyliczeniowe {

    public static void main(String[] args) {

        // DayfOfTheWeek day = DayfOfTheWeek.FRIDAY;

        for (DayfOfTheWeek day : DayfOfTheWeek.values()) {

            System.out.println(day);
        }
    }

    enum DayfOfTheWeek {

        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
