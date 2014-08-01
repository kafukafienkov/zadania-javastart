/**
 * Created by Bartek on 2014-07-11.
 */

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        super("Yallow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocation(425, 135);
        setSize(250, 250);
        setLayout(new FlowLayout());
        /*Container container = getContentPane();

        container.add(new JButton("Button no 1"));
        container.add(new JButton("Button no 2"));
        container.add(new JButton("Button no 3"));*/

        for (int i = 0; i < 10; i++) {
            add(new JButton("" + (i + 1)));
        }

        setVisible(true);

    }
}


