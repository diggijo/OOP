package Lab5.Exercise3;

public class Thermometer {
    private int currentTemp;
    private int maxTemp;
    private int minTemp;

    public Thermometer() {
        setCurrentTemp(0);
        setMaxTemp(Integer.MIN_VALUE);
        setMinTemp(Integer.MAX_VALUE);
    }

    public Thermometer(int currentTemp) {
        setCurrentTemp(currentTemp);
        setMaxTemp(currentTemp);
        setMinTemp(currentTemp);
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public void setTemperature(int currentTemp) {
        setCurrentTemp(currentTemp);
        updateMaxMinTemp();
    }

    private void updateMaxMinTemp() {

        if (currentTemp > maxTemp)
            maxTemp = currentTemp;

        if (currentTemp < minTemp)
            minTemp = currentTemp;
    }

    public String toString() {
        return "currentTemp = " + currentTemp +
                "\nmaxTemp = " + maxTemp +
                "\nminTemp = " + minTemp;
    }
}
