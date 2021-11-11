package Lab8.Exercise2;

public class Bicycle extends Vehicle {
    private int gearCount;
    private boolean hasBell;

    public Bicycle(){
        setGearCount(0);
        setHasBell(false);
    }

    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, int gearCount, boolean hasBell) {
        super(price, length, height, weight, manufacturer, model);
        setGearCount(gearCount);
        setHasBell(hasBell);
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean getHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        String output = super.toString() +
                "\nGear Count: " + getGearCount() +
                "\nHas Bell: ";

        if(getHasBell())
            output += "Yes";
        else
            output += "No";

        return output;
    }
}
