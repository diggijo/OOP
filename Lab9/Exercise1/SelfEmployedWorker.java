package Lab9.Exercise1;

public final class SelfEmployedWorker extends Employee{
    private double EstimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName, double estimatedIncome) {
        super(firstName, lastName);
        setEstimatedIncome(estimatedIncome);
    }

    public void setEstimatedIncome(double estimatedIncome) {
        EstimatedIncome = estimatedIncome;
    }

    public double earnings(){
        return EstimatedIncome;
    }

    @Override
    public String toString() {
        return "Self-Employed worker's name is " + super.toString();
    }
}
