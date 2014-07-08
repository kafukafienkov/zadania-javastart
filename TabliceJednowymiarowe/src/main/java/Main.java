import java.util.Scanner;

/**
 * Created by Bartek on 2014-07-08.
 */
public class Main {

    public static void main(String[] args) {

        String[] imiona = new String[5];   //tworzymy tablicę 5-elementową typu String

        for (int i = 0; i < 5; i++) {      //w pętli for zapełniamy tablicę danymi - tu imionami - pobranymi od użytkownika

            System.out.println("Podaj imię które dodam do tablicy imiona: ");
            Scanner scanner = new Scanner(System.in);
            imiona[i] = scanner.nextLine();
        }

        for (String x : imiona) {                   //wypisujemy zawartość tablicy przy użyciu pętli for...each
            System.out.println("Witaj " + x);
        }
    }

}
