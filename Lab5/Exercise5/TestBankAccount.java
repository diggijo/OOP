package Lab5.Exercise5;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {

        String text="";

        BankAccount firstAccount = new BankAccount();

        text += "Calling the no-argument Bank Account constructor. The first BankAccount object details are: " +
                firstAccount;

        BankAccount secondAccount = new BankAccount("Richy Rich", 0.75);

        text += "\n\nCalling the multi-argument BankAccount constructor. The second BankAccount object details are: " + secondAccount;

        BankAccount.setInterestRate(0.5);

        text += "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5";

        text += "\n\nThe first BankAccount object details are: " + firstAccount;

        text += "\n\nThe second BankAccount object details are: " + secondAccount;

        text += "\n\nThe number of BankAccount objects created is: " + BankAccount.getCount();

        JOptionPane.showMessageDialog(null, text, "BankAccount Object Data", JOptionPane.INFORMATION_MESSAGE);

    }
}

