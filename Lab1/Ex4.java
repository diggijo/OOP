package Lab1;

import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {

        final float under10k=1.75f, over10k=2.5f;
        String name, distanceAsString;
        float distance;
        float sponsor;

        name = JOptionPane.showInputDialog("Please enter your name");
        distanceAsString = JOptionPane.showInputDialog("Please enter the KMs you travelled");
        distance = Float.parseFloat(distanceAsString);

        if (distance<=10)
        {
            sponsor = distance*under10k;
        }

        else
        {
            sponsor = (under10k*10) + ((distance-10)*over10k);
        }

        JOptionPane.showMessageDialog(null, "Name: " + name +
                "\nDistance Cycled: " + String.format("%.0f", distance) + "km" + "\nSponsorship amount due : €" + String.format("%.2f", sponsor), "Receipt", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
