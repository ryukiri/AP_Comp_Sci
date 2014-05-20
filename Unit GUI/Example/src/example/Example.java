import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Panel;

public class Example {
    public static void main(String[] args) {
        //Frame
        final JFrame frame = new JFrame("Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        //Panels
        final JPanel mainPanel = new JPanel();

        //Menu Bar
        JMenuBar menuBar = new JMenuBar();
        final JMenu temperature = new JMenu("Temperature");
        final JMenu distance = new JMenu("Distance");
        final JMenu other = new JMenu("Other");
        menuBar.add(temperature);
        menuBar.add(distance);
        menuBar.add(other);

        //Menu Items
        final JMenuItem deg = new JMenuItem("Celsius & Fahrenheit");
        final JMenuItem mile = new JMenuItem("Miles & Kilometers");
        final JMenuItem yd = new JMenuItem("Yards & Meters");
        final JMenuItem quit = new JMenuItem("Quit");

        temperature.add(deg);
        distance.add(mile);
        distance.add(yd);
        other.add(quit);

        frame.setJMenuBar(menuBar);

        //Labels
        final JLabel input = new JLabel("Enter degrees: ");
        final JLabel output = new JLabel(" ");
        final JLabel result = new JLabel(" ");

        //Text Fields
        final JTextField degree = new JTextField(5);

        //Buttons
        ButtonGroup group = new ButtonGroup();
        final JRadioButton fahrenheit = new JRadioButton("F");
        final JRadioButton celsius = new JRadioButton("C");
        group.add(fahrenheit);
        group.add(celsius);

        final JButton button = new JButton("Convert");

        //Panel for meters
        final JPanel meterPanel = new JPanel();
        final JLabel inputDistance = new JLabel("Enter measurement: ");
        final JLabel outputDistance = new JLabel(" ");
        final JLabel resultDistance = new JLabel(" ");

        final JTextField distanceBox = new JTextField(5);

        ButtonGroup groupDistance = new ButtonGroup();
        final JRadioButton meters = new JRadioButton("M");
        final JRadioButton yards = new JRadioButton("Y");
        groupDistance.add(meters);
        groupDistance.add(yards);

        JButton buttonDistance = new JButton("Convert");
        //End Panel for meters

        //Panel for Miles
        final JPanel milePanel = new JPanel();
        final JLabel inputMile = new JLabel("Enter measurement: ");
        final JLabel outputMile = new JLabel(" ");
        final JLabel resultMile = new JLabel(" ");

        final JTextField mileBox = new JTextField(5);

        ButtonGroup groupMile = new ButtonGroup();
        final JRadioButton miles = new JRadioButton("Mi");
        final JRadioButton kilometers = new JRadioButton("Ki");
        groupMile.add(miles);
        groupMile.add(kilometers);

        JButton buttonMile = new JButton("Convert");
        //End Panel for Miles

        class ConvertListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                if(fahrenheit.isSelected()){
                    double f = Double.parseDouble(degree.getText());
                    double c = (f-32)*5/9;
                    result.setText(c+"");
                    output.setText("Degrees in Celsius: ");
                }else if(celsius.isSelected()){
                    double c = Double.parseDouble(degree.getText());
                    double f = c*5/9+32;
                    result.setText(f+"");
                    output.setText("Degrees in Fahrenheit: ");
                }else if(meters.isSelected()){
                    double m = Double.parseDouble(distanceBox.getText());
                    double y = m*1.09361;
                    resultDistance.setText(y+"");
                    outputDistance.setText("Distance in Yards: ");
                }else if(yards.isSelected()){
                    double y = Double.parseDouble(distanceBox.getText());
                    double m = y*0.9144;
                    resultDistance.setText(m+"");
                    outputDistance.setText("Distance in Meters: ");
                }else if(miles.isSelected()) {
                    double m = Double.parseDouble(mileBox.getText());
                    double km = m * 1.60934;
                    resultMile.setText(km + "");
                    outputMile.setText("Distance in Kilometers: ");
                }else if(kilometers.isSelected()) {
                    double km = Double.parseDouble(mileBox.getText());
                    double m = km * 0.621371;
                    resultMile.setText(m + "");
                    outputMile.setText("Distance in Miles: ");
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

        frame.add(mainPanel);
        frame.setVisible(true);
        //End of Page 1

        //Yrds and Meters Panel
        final JPanel distancePanel = new JPanel();
        buttonDistance.addActionListener(listener);
        distancePanel.add(inputDistance);
        distancePanel.add(distanceBox);
        distancePanel.add(meters);
        distancePanel.add(yards);
        distancePanel.add(buttonDistance);
        distancePanel.add(outputDistance);
        distancePanel.add(resultDistance);

        //Miles and Kilo Panel
        final JPanel miKi = new JPanel();
        buttonMile.addActionListener(listener);
        miKi.add(inputMile);
        miKi.add(mileBox);
        miKi.add(miles);
        miKi.add(kilometers);
        miKi.add(buttonMile);
        miKi.add(outputMile);
        miKi.add(resultMile);


        class MenuListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                JMenuItem source = (JMenuItem) event.getSource();
                if(source == mile){
                    frame.remove(mainPanel);
                    frame.remove(distancePanel);
                    frame.add(miKi);
                    frame.invalidate();
                    frame.validate();
                    frame.repaint();
                }else if(source == deg){
                    frame.remove(distancePanel);
                    frame.remove(mainPanel);
                    frame.remove(miKi);
                    frame.add(mainPanel);
                    frame.invalidate();
                    frame.validate();
                    frame.repaint();
                }else if(source == yd){
                    frame.remove(distancePanel);
                    frame.remove(mainPanel);
                    frame.remove(miKi);
                    frame.add(distancePanel);
                    frame.invalidate();
                    frame.validate();
                    frame.repaint();
                }else if(source == quit){
                    JOptionPane.showMessageDialog(frame, "Sorry, cannot quit.");
                }
            }
        }

        ActionListener menuListener = new MenuListener();
        deg.addActionListener(menuListener);
        mile.addActionListener(menuListener);
        yd.addActionListener(menuListener);
        quit.addActionListener(menuListener);
    }
}
