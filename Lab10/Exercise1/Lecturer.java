package Lab10.Exercise1;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Lecturer implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCoursesTaught(coursesTaught);
        setDateOfAppointment(dateOfAppointment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public abstract String getStatus();

    public abstract int getPointOnScale();

    public String toString() {
        String str="";

        str += "Lecturer name is: " + getName() +
                "\nAddress is: " + getAddress() +
                "\nLecturers DOB is: ";

        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        if(getDateOfBirth()!=null)
        {
            Date dob = getDateOfBirth().getTime();
            String strDob = formatDate.format(dob);
            str+=strDob;
        }
        else
            str+="Undefined";

        str += "\nLecturers Staff ID is: " + getStaffID() +
                "\nCourses Taught: " + Arrays.toString(getCoursesTaught()) +
                "\nDate of Appointment: " + formatDate.format(getDateOfAppointment().getTime()) +
                "\nLecturer Status: " + getStatus() +
                "\nLecturer Point on Scale: " + getPointOnScale();

        return str;
    }
}
