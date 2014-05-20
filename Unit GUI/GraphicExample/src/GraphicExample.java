
import javax.swing.*;
import java.awt.*;

public class GraphicExample {
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Graphics Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        GraphicsComponent graphics = new GraphicsComponent();
        frame.add(graphics);
        frame.setVisible(true);
    }
}
