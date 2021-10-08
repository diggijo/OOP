package Lab4.Exercise1;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output = "";

        Computer c1 = new Computer();

        output += "Calling the no-arguement Computer constructor. " +
                "The first Computer object details are: \n\n" + c1.toString();

        Computer c2 = new Computer("Dell", "Laptop", 3.25, 16, 550.99);

        output += "\n\nCalling the multi-arguement Computer constructor. " +
                "The second computer object details are: \n\n" + c2.toString();

        Computer c3 = new Computer("Apple", "Tablet", -3.65, -16, -500.25);

        output += "\n\nCalling the multi-arguement Computer constructor. " +
                "The third computer object details are: \n\n" + c3.toString();

        JOptionPane.showMessageDialog(null, output, "Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
