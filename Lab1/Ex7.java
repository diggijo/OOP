package Lab1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String text, shortest="";
        int count=0;

        do{
          System.out.print("Please enter a piece of text " + (count+1) + ": ");
          text = s.nextLine();

          int i=0, j=1, lowerCase=0, words=1, ed=0;

            while(i < text.length())
            {
                if(text.charAt(i)=='a' || text.charAt(i)=='e' || text.charAt(i)=='i' || text.charAt(i)=='o' || text.charAt(i)=='u')
                    {
                        lowerCase++;
                    }
                if(text.charAt(i)==' ')
                {
                    words++;
                }

                if(text.charAt(i)=='e' && text.charAt(j)=='d')
                {
                    ed++;
                }
                i++;
                j++;
            }

          System.out.println("\n\t\t\t******Text Data******" +
                               "\nNumber of characters: " + text.length() +
                                "\nNumber of lowercase vowels: " + lowerCase +
                                 "\nNumber of words: " + words +
                                  "\nNumber of times \"ed\" appears in the text: " +  ed +"\n");

            if(i==1)
                shortest=text;
            else if(text.length()<shortest.length())
                shortest=text;

         count++;
        }while(count<3);

        System.out.print("\n\t\t\t******Overall Results******" +
                            "\nShortest piece of text: " +
                              "\nAverage number of words: ");

    }
}
