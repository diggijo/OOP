package Lab6.Exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {

        String text = "";
        String firstName, lastName;

        Person firstPerson = new Person();

        text += "\n\nCalling the Person() constructor...." +
                "\nValue for the first Person object is: " + firstPerson;

        firstName = JOptionPane.showInputDialog("Please enter the first name of the second person");
        lastName = JOptionPane.showInputDialog("Please enter the last name of the second person");

        Person secondPerson = new Person(firstName, lastName);

        text += "\n\nCalling the Person(String, String) constructor after getting user-supplied values...." +
                "\nValue for the first Person object is: " + secondPerson;

        JOptionPane.showMessageDialog(null, "*****Person Class Tester*****" + text, "", JOptionPane.INFORMATION_MESSAGE);
    }
}
