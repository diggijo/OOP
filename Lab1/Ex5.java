package Lab1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        final float gravity=9.81f;
        float massE, massP, radiusE, radiusP, g;

        System.out.print("Please enter the mass of planet Earth: ");
        massE = s.nextFloat();

        System.out.print("Please enter the radius of planet Earth: ");
        radiusE = s.nextFloat();

        System.out.print("Please enter the mass of the other planet: ");
        massP = s.nextFloat();

        System.out.print("Please enter the radius of the other planet: ");
        radiusP = s.nextFloat();

        g = (gravity*massP*(radiusE*radiusE))/(massE*(radiusP*radiusP));

        System.out.println("\nThe acceleration due to gravity on the other planet is " + String.format("%.2f", g) + " m/s/s");

    }
}
