package Lab6.Exercise1;

public class Person {
    private String firstName;
    private String lastName;

    public Person(){
        setFirstName("Not Supplied");
        setLastName("Not Supplied");
    }

    public Person(String firstName, String lastName){
        setName(firstName, lastName);
    }

    public void setName(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "First Name: " + getFirstName() +
                " Last Name: " + getLastName();
    }
}
