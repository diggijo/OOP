package Lab2;

import javax.swing.*;

public class Ex1 {
    public static void main(String[] args) {

        String serial, processorType, hardDiskSpaceAsString, processorTypeonCheapest="";
        int diskSpace=0, i=0, totalDiskSpace=0;
        float price, cheapest=0, dearest=0, avgSpace=0;
        boolean valid;

        serial = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");

        while(!serial.equals(""))
        {
            hardDiskSpaceAsString = JOptionPane.showInputDialog("Please enter the "
                    + "hard-disk space");
            valid = false;

            while(!valid) {
                for (i = 0; i < hardDiskSpaceAsString.length(); i++)
                    if (!Character.isDigit(hardDiskSpaceAsString.charAt(i)))
                        break;

                if (i < hardDiskSpaceAsString.length()) {
                    hardDiskSpaceAsString = JOptionPane.showInputDialog(
                            "Invalid! Please re-enter hard-disk space");
                } else {
                    diskSpace = Integer.parseInt(hardDiskSpaceAsString);

                    if (diskSpace > 50 && diskSpace < 5000)
                        valid = true;
                    else
                        hardDiskSpaceAsString = JOptionPane.showInputDialog(
                                "Invalid! Please re-enter hard-disk space");
                }

            }
                processorType = JOptionPane.showInputDialog("Please enter the processor type");

                price = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price"));

                totalDiskSpace += diskSpace;

                serial = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");
        }

            JOptionPane.showMessageDialog(null, "The average disk space available on the computers processed is: " + totalDiskSpace + avgSpace +
                    "\nThe price range of the computers is from " + cheapest + " to " + dearest +
                    "\nThe processor type on the cheapest computer is " + processorTypeonCheapest, "Computer Stats", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}

