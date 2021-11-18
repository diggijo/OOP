package Lab12;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;
import java.util.Locale;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class Exercise1 extends JFrame {

    private JTextArea textArea;

    public Exercise1() {
        super("Text Analyser");

        BorderLayout layout = new BorderLayout(3, 4);
        setLayout(layout);

        JLabel promptLabel = new JLabel("Please enter the text on the text-area below:");
        add(promptLabel, BorderLayout.NORTH);

        textArea = new JTextArea();
        textArea.setForeground(Color.BLUE);
        textArea.setLineWrap(true);
        add(textArea, BorderLayout.CENTER);


        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Program Information", "Program Information", JOptionPane.INFORMATION_MESSAGE);
            }

            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Thanks for using the program", "Exiting Application", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }

            public void windowIconified(WindowEvent e) {
                String text = textArea.getText();
                int noVowels=0, noLetters=0, noDigits=0, noWords=0, noSentences=0, endsD=0;
                char nextCh=' ';


                for(int i=0; i<text.length(); i++)
                {
                    if(text.toLowerCase().charAt(i)=='a' || text.toLowerCase().charAt(i)=='e' ||
                            text.toLowerCase().charAt(i)=='i' || text.toLowerCase().charAt(i)=='o' ||
                            text.toLowerCase().charAt(i)=='u')
                        noVowels++;

                    if(isLetter(text.charAt(i)))
                        noLetters++;

                    if(isDigit(text.charAt(i)))
                        noDigits++;

                    if(text.charAt(i)==' ')
                        noWords++;

                    if(text.charAt(i)=='.' || text.charAt(i)=='!' || text.charAt(i)=='?')
                        noSentences++;

                    if(i<text.length()-1)
                        nextCh = Character.toLowerCase(text.charAt(i+1));
                    if(text.charAt(i)=='d' && (nextCh=='.' || nextCh=='?' || nextCh=='!' || nextCh==' ' || nextCh==','))
                        endsD++;
                }
                JOptionPane.showMessageDialog(null, "Total number of characters: " + text.length() + "\nTotal number of vowels: " + noVowels + "\nTotal number of letters: " + noLetters + "\nTotal number of digits: " +
                        noDigits + "\nTotal number of words: " + noWords + "\nTotal number of sentences: " + noSentences + "\nTotal number of words ending with D: " + endsD, "Program Data", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        setSize(400, 300);

        setVisible(true);
    }

    public static void main(String args[]) {
        Exercise1 e = new Exercise1();
    }
}
