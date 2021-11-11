package Lab9.Sample1;

public class Employee {

    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return getFirstName() + " " + getLastName();
    }

    public double earnings(){
        return 0; //It won't be our intention to create generic Employee objects here
    }
}
