import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class ImageExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1500);
                
        JPanel mainPanel = new JPanel();
        final JPanel imagePanel = new JPanel();
        
        ImageComponent picture = new ImageComponent("test2.jpg");
        imagePanel.add(picture);
        mainPanel.add(imagePanel);
        
        JButton swap = new JButton("Switch");
        mainPanel.add(swap);
        
        class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                imagePanel.removeAll();
                ImageComponent pic = new ImageComponent("test1.jpg");
                imagePanel.add(pic);
                imagePanel.invalidate();
                imagePanel.validate();
                imagePanel.repaint();
            }
        }
        
        ActionListener buttonListener = new ButtonListener();
        swap.addActionListener(buttonListener);
        
        /*
        ImageComponent picture2 = new ImageComponent("test2.jpg");
        picture2.resize(640, 360);
        imagePanel.add(picture2);
        mainPanel.add(imagePanel);
        */
        
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
