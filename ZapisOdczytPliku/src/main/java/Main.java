import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Bartek on 2014-07-07.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);  //tworzymy obiekt klasy Scanner

        System.out.println("Podaj swoje imię: ");   //pobieramy imię od użytkownika
        String imie = scan.nextLine();  //zapisujemy imię użytkownika w zmiennej imię

        PrintWriter writer = new PrintWriter("imie.txt"); //tworzymy nowy obiekt klasy PrintWriter i plik tekstowy
        writer.print(imie); //zapisujemy w pliku wcześniej pobrany String imię
        writer.close();

        File file = new File("imie.txt"); //teraz tworzymy nowy obiekt klasy File odczytujący nasz wcześniej utworzony plik
        Scanner scanner = new Scanner(file); //ponownie tworzymy obiekt klasy Scanne odczytujący nasz plik

        String imieZPliku = scanner.nextLine(); //Scanner odczytuje imię
        System.out.println(imieZPliku);         // wypisujemy imię na konsole
    }
}
