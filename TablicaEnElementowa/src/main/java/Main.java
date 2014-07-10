import java.util.Scanner;

/**
 * Created by Bartek on 2014-07-08.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ile elementów ma mieć tablica: ");
        int n = scanner.nextInt();
        int[] board = new int[n];
        scanner.close();

        int i = 0;
        while (n > i) {
            board[i] = i + 1;
            System.out.print(board[i] + " ");
            i++;
        }

    }
}

