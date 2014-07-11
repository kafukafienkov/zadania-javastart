import java.awt.*;

/**
 * Created by Bartek on 2014-07-11.
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });

    }

    ;
}