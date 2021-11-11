package Lab8.Exercise1;

public class Car extends Vehicle{
    private int maxPassengers;
    private String regNumber;

    public Car() {
        setMaxPassengers(0);
        setRegNumber("No Registration Number Specified");
    }

    public Car(double price, double length, double height, double weight, String manufacturer, String model, int maxPassengers, String regNumber) {
        super(price, length, height, weight, manufacturer, model);
        setMaxPassengers(maxPassengers);
        setRegNumber(regNumber);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String toString() {
        return super.toString() +
                "\nMax Passengers: " + getMaxPassengers() +
                "\nRegistration Number: " + getRegNumber();
    }
}
