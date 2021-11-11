package Lab8.Exercise2;

public class TestVehicle {
    public static void main(String[] args) {

        String output="";

        output += "Testing the Car no-arg constructor:\n\n";
        Car car1 = new Car();
        output += car1;

        output += "\n\nTesting the Car multi-arg constructor:\n\n";
        Car car2 = new Car(100000.00, 4.5, 1.25, 2000.00, "Ferrari", "F2", 2, "08-KY-5");
        output += car2;

        output += "\n\nTesting the Bicycle no-arg constructor:\n\n";
        Bicycle b1 = new Bicycle();
        output += b1;

        output += "\n\nTesting the Bicycle multi-arg constructor:\n\n";
        Bicycle b2 = new Bicycle(500.00, 1.5, 1.00, 50.00, "Raleigh", "Mountain Bike", 4, true);
        output += b2;

        System.out.println(output);
    }
}
