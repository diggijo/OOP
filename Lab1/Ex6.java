package Lab1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        final float GLOBAL_AVERAGE_HEIGHT=1.665f;
        float height=0, total=0, average=0, smallest=0, percentOvr=0;
        int count=0, between=0, aboveAvg=0;

        while(count<6) {
            System.out.print("Loop " + (count + 1) + "- Please enter height: ");
            height = s.nextFloat();

            while (0.5464 > height || height > 2.72) {
                System.out.print("Loop " + (count + 1) + "- Invalid Height entered! Please re-enter height: ");
                height = s.nextFloat();
            }

            if (height < smallest) {
                smallest = height;
            } else {
                smallest = height;
            }

            if (height >= 1.3 && height <= 1.9) {
                between++;
            }

            if(height>GLOBAL_AVERAGE_HEIGHT)
            {
                aboveAvg++;
            }

            count++;
            total = total + height;
        }

        percentOvr = ((float)aboveAvg)/count*100;

        average = total/count;

        System.out.println("\n________________________________" +
                              "\n       Height Statistics       " +
                                "\n________________________________" +
                                    "\n\nThe average of the heights entered is " + String.format("%.1f", average) + "m" +
                                        "\nThe smallest height value entered is " + smallest + "m" +
                                            "\nThe number of height values between 1.3m and 1.9m inclusive is " + between +
                                                "\nThe percentage of height values exceeding the global average height is " + String.format("%.2f", percentOvr) + "%");



    }
}
