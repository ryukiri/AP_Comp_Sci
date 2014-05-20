import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class GraphicsComponent extends JComponent {
    
    public void paintComponent(Graphics g){
        //Recover Graphics 2D
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(180, 150, 300, 250);
        g2.setColor(Color.YELLOW);
        g2.fill(ellipse1);
        
        Ellipse2D.Double ellipse2 = new Ellipse2D.Double(230, 175, 200, 200);
        g2.setColor(Color.RED);
        g2.fill(ellipse2);
        
        Ellipse2D.Double ellipse3 = new Ellipse2D.Double(275, 225, 100, 100);
        g2.setColor(Color.BLUE);
        g2.fill(ellipse3);
        
        g2.setColor(Color.GREEN);
        g2.drawString("Hello", 313, 271);
        
        g2.setColor(Color.MAGENTA);
        Line2D.Double line1 = new Line2D.Double(25, 290, 405, 90);
        g2.draw(line1);
        
        Rectangle2D.Double rectangle1 = new Rectangle2D.Double(25, 30, 100, 150);
        g2.setColor(Color.ORANGE);
        g2.fill(rectangle1);

        //g2.setColor(Color.BLUE);
        //g2.draw(ellipse1);
    }
}
