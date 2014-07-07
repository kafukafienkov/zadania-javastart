import java.util.Scanner;

/**
 * Created by Bartek on 2014-07-07.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj dowolną liczbę większą od 0: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        /*while (a > 0) {                                       // pętla while
            System.out.println("Bomba wybuchnie za: " + a);
            a--;
        }*/

        /*for ( int i = a; i > 0 ; i--) {                       // pętla for
            System.out.println("Bomba wybuchnie za: " + i);
        }*/

        do {                                                    // pętla do...while
            System.out.println("Bomba wybuchnie za: " + a);
            a--;
        } while (a > 0);
        //System.out.println("B U M !!!!!!!!");
    }
}
