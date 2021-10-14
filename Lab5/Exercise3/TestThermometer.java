package Lab5.Exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        int temperature;
        String text;

        text = "Calling the single-argument constructor....." +
                "setting the temperature of the first thermometer to 35C";

        Thermometer firstThermometer = new Thermometer(35);

        text += "\nFirst Thermometer: \n" + firstThermometer;

        text += "\n\nCalling the no-argument constructor....." +
                "setting the temperature of the second thermometer to 0C";

        Thermometer secondThermometer = new Thermometer();

        text += "\nSecond Thermometer: \n" + secondThermometer;

        text += "\n\nCalling setTemperature()....." +
                "setting the temperature of the second thermometer to 25C";

        secondThermometer.setTemperature(25);

        text += "\nSecond Thermometer: \n" + secondThermometer;

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\n" + text,"",
                JOptionPane.INFORMATION_MESSAGE);

        temperature = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer"));

        text += "\n\nCalling setTemperature()..... setting the temperature of the first thermometer to " + temperature + "C";

        firstThermometer.setTemperature(temperature);

        text += "\nFirstThermometer: \n" + firstThermometer;

        JOptionPane.showMessageDialog(null,"*****Thermometer Testing*****\n\n" + text,"",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
