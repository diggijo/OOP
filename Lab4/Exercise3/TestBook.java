package Lab4.Exercise3;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        Book b1 = new Book();

        output += "Calling the no-arguement Book constructor. " +
                "The first Book object details are: \n\n" + b1.toString();

        Book c2 = new Book("The Davinci Code", 19.99, "3452617232", 348);

        output += "\n\nCalling the multi-arguement Book constructor. " +
                "The second book object details are: \n\n" + c2.toString();


        JOptionPane.showMessageDialog(null, output, "Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
