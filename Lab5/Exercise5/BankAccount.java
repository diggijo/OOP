package Lab5.Exercise5;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count;

    public BankAccount(){
        setOwner("Owner not Available");
        incrementCount();
        setNumber(count);
        setInterestRate(0);
    }

    public BankAccount(String owner, double interestRate){
        setOwner(owner);
        incrementCount();
        setNumber(count);
        setInterestRate(interestRate);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    private static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String toString() {
        return "\nOwner: " + owner +
                "    Account Number: " + number +
                "    Interest Rate: " + BankAccount.interestRate;
    }
}
