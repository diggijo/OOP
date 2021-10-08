package Lab1;

import javax.swing.*;



public class Ex3 {

    public static void main(String[] args) {

        float number;
        final float value=2f;
        String name, course, numberasString;

        name = JOptionPane.showInputDialog("Please enter your name");
        course = JOptionPane.showInputDialog("Please enter your course");
        numberasString = JOptionPane.showInputDialog("How many snacks would you like");
        number = Float.parseFloat(numberasString);

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nCourse: " + course +
                "\nSnacks: " + String.format("%.0f", number) + "\nCost: €" + String.format("%.0f", number*value), "Receipt", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
