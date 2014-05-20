package finalproject;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FinalProject {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu temperature = new JMenu("Temperature");
        JMenu distance = new JMenu("Distance");
        JMenu other = new JMenu("Other");
        menuBar.add(temperature);
        menuBar.add(distance);
        menuBar.add(other);
        
        final JMenuItem deg = new JMenuItem("Celsius & Fahrenheit");
        final JMenuItem mile = new JMenuItem("Miles & Kilometers");
        final JMenuItem yd = new JMenuItem("Yards & Meters");
        final JMenuItem x = new JMenuItem("Babies");
        
        temperature.add(deg);
        distance.add(mile);
        distance.add(yd);
        other.add(x);
        
        frame.setJMenuBar(menuBar);
        
        final JPanel distancePanel = new JPanel();
        final JLabel construction = new JLabel("Page Under Construction");
        distancePanel.add(construction);
        //final JLabel inputForDistance = new JLabel("Enter distance: ");
        //distancePanel.add(inputForDistance);
        //final JLabel outputForDistance = new JLabel(" ");
        //final JLabel resultForDistance = new JLabel(" ");
        //distancePanel.add(inputForDistance);
        //distancePanel.add(outputForDistance);
        //distancePanel.add(resultForDistance);
        
        //ButtonGroup groupDistance = new ButtonGroup();
        //final JRadioButton meter = new JRadioButton("m");
        //final JRadioButton miles = new JRadioButton("mi");
        //groupDistance.add(meter);
        //groupDistance.add(miles);
        
        //JPanel panel11 = new JPanel();
        //JPanel panel22 = new JPanel();
        //JPanel panel32 = new JPanel();
        //panel11.add(inputForDistance);

        final JPanel mainPanel = new JPanel();
        
        final JLabel input = new JLabel("Enter degrees: ");
        final JLabel output = new JLabel(" ");
        final JLabel result = new JLabel(" ");
        
        final JTextField degree = new JTextField(5);
        
        ButtonGroup group = new ButtonGroup();
        final JRadioButton fahrenheit = new JRadioButton("F");
        final JRadioButton celsius = new JRadioButton("C");
        group.add(fahrenheit);
        group.add(celsius);
        
        JButton button = new JButton("Convert");
        
        class MenuListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                JMenuItem source = (JMenuItem) event.getSource();
                if(source == mile){
                    frame.remove(mainPanel);
                    frame.add(distancePanel);
                    frame.invalidate();
                    frame.validate();
                    frame.repaint();
                }else if(source == deg){
                    frame.remove(distancePanel);
                    frame.add(mainPanel);
                    frame.invalidate();
                    frame.validate();
                    frame.repaint();
                }else if(source == yd){
                    int one = 1;
                    //while(one<1000){
                    JOptionPane.showMessageDialog(frame, "Yards & Meters has not been implemented yet");
                    //one++;
                    //}
                }else if(source == x){
                    JOptionPane.showMessageDialog(frame, "No babies are here to convert yet.");
                }
            }
        }
        
        ActionListener menuListener = new MenuListener();
        deg.addActionListener(menuListener);
        mile.addActionListener(menuListener);
        yd.addActionListener(menuListener);
        x.addActionListener(menuListener);
        
        class ConvertListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                if(fahrenheit.isSelected())
                {
                    double f = Double.parseDouble(degree.getText());
                    double c = (f-32)*5/9;
                    result.setText(c+"");
                    output.setText("Degrees in Celcius: ");
                }else if(celsius.isSelected()){
                    double c = Double.parseDouble(degree.getText());
                    double f = c*5/9+32;
                    result.setText(f+"");
                    output.setText("Degrees in Fahrenheit: ");
                }else if(mile.isSelected()){
                    
                }
            }
        }
        
            ActionListener listener = new ConvertListener();
            button.addActionListener(listener);
            
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            
            panel1.add(input);
            panel1.add(degree);
            panel1.add(fahrenheit);
            panel1.add(celsius);
            panel2.add(button);
            panel3.add(output);
            panel3.add(result);
            
            
            mainPanel.setLayout(new GridLayout(3,1));
            mainPanel.add(panel1);
            mainPanel.add(panel2);
            mainPanel.add(panel3);
            mainPanel.setBackground(Color.BLUE);
            
            frame.add(mainPanel);
            frame.setVisible(true);
        
        }
    }