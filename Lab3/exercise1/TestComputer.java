package Lab3.exercise1;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args){
        String output = "";

        Computer c1 = new Computer();

        output += "Calling the no-arguement Computer constructor. " +
                "The first Computer object details are: \n\n" + c1.toString();

        Computer c2 = new Computer("Dell", "Laptop", 3.25, 16, 550.99);

        c2.setSpeed(-3.15);

        output += "\n\nCalling the multi-arguement Computer constructor. " +
                "The second computer object details are: \n\n" + c2.toString();

        JOptionPane.showMessageDialog(null, output, "Computer Object Data",
                                        JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
