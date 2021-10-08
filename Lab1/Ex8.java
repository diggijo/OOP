package Lab1;

import javax.swing.*;

public class Ex8 {
    public static void main(String[] args) {

        String userNoAsString, menuChoiceAsString;
        int count=0, userNo, menuChoice;

        do{
            userNoAsString = JOptionPane.showInputDialog("------Iteration " + (count+1) + "-------" +
                    "\n\nPlease enter any whole number:");
            userNo = Integer.parseInt(userNoAsString);

            menuChoiceAsString = JOptionPane.showInputDialog("What would you like to do?" +
                                                            "\n\n1. Determine if the number is odd or even." +
                                                            "\n2. Find the factorial of the number." +
                                                            "\n3. Quit the program.");
            menuChoice = Integer.parseInt(menuChoiceAsString);

            switch(menuChoice){
                case 1:
                    if(userNo % 2 ==0)
                    {
                        JOptionPane.showMessageDialog(null, "The number you entered is even", "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "The number you entered is odd", "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 2:
                    int factorial=1;

                    if(userNo>0)
                    {
                        for(int i=0; i<userNo; i++)
                        {
                            factorial = factorial*(userNo-i);
                        }

                    JOptionPane.showMessageDialog(null, "The factorial of the number you entered is " + factorial, "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Cannot get the factorial of a negative number", "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Quitting the program earlier than anticipated... Goodbye", "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
            }

            count++;
        }while(count<10);

        System.exit(0);
    }
}
