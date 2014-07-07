import java.util.Scanner;

/**
 * Created by Bartek on 2014-07-07.
 */
public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        double x = in.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double y = in.nextDouble();

        double suma = x + y;
        double roznica = x - y;
        double iloczyn = x * y;
        double iloraz = x / y;

        System.out.println("Suma podanych liczb x i y to: " + suma);
        System.out.println("Różnica podanych liczb x i y to: " + roznica);
        System.out.println("Iloczyn podanych liczb x i y to: " + iloczyn);
        System.out.println("Iloraz podanych liczb x i y to: " + iloraz);
    }

}