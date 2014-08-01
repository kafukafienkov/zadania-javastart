/**
 * Created by Bartek on 2014-07-15.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class MyFrame2 extends JPanel {
    public MyFrame2() {
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // prostokat
        Rectangle2D rectangle = new Rectangle2D.Double(10, 10, 380, 380);
        // kolo
        Ellipse2D circle = new Ellipse2D.Double(10, 10, 380, 380);

        g2d.draw(rectangle);
        g2d.draw(circle);
    }
}


//Czytaj więcej na: http://javastart.pl/grafika_awt_swing/proste-rysowanie-jpanel-i-jcomponent/#ixzz37UGiAX74


//Czytaj więcej na: http://javastart.pl/grafika_awt_swing/proste-rysowanie-jpanel-i-jcomponent/#ixzz37UGE5BLZ