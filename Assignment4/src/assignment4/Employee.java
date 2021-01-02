package assignment4;
import java.util.Date;
import java.util.Objects;

/**
 * Simple class for employee of a department
 * @author maria ramlochan
 */
public abstract class Employee extends Department implements Parking{
    //Data members
    protected String id;
    protected Date firstDayHired;
    protected int hoursWorked;

    /**
     * Method to calculate paycheck
     * @return the paycheck for either manager or regular employee
     */
    protected abstract double paycheck();
    
    /**
     * Default constructor
     */
    public Employee() {
        super();
        this.id = "";
        this.firstDayHired = new Date();
        this.hoursWorked = 0;
    }

    /**
     * Constructor with all data members
     * @param id the ID of employees and manager
     * @param firstDateHired the first day employees and manger were hired
     * @param hoursWorked the number of hours worked
     * @param name name of the employees and clients
     * @param gender gender of the employees and clients
     * @param age age of employees and clients
     * @param email email of the employees and clients
     * @param address address of the employees and clients
     */
    public Employee(String id, Date firstDateHired, int hoursWorked, String name,
            String gender, int age, String email, Address address) {
        super(name, gender, age, email, address);
        this.id = id;
        this.firstDayHired = firstDateHired;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Copy constructor
     * @param employee the employee
     */
    public Employee(Employee employee) {
        super(employee);
        this.id = employee.id;
        this.firstDayHired = employee.firstDayHired;
        this.hoursWorked = employee.hoursWorked;
    }
    
    @Override
    public void regesterCar() {
        System.out.println("Car registered for employee");
    }
    
    //HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + super.hashCode();
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.firstDayHired);
        hash = 37 * hash + this.hoursWorked;
        return hash;
    }
    
    //Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!super.equals(obj))
            return false;
        if (this.hoursWorked != other.hoursWorked) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.firstDayHired, other.firstDayHired)) {
            return false;
        }
        return true;
    }
    
    //ToString
    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("%-10s: %s\n", "ID: ", id);
        str += String.format("%-10s: %s\n", "First Day Hired: ", firstDayHired);
        str += String.format("%-10s: %s\n", "Hours Worked: ", hoursWorked);
        return str;
    }
    
    //Getters
    public String getId() {
        return id;
    }
    public Date getFirstDayHired() {
        return firstDayHired;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
   
    //Setters
    public void setId(String id) {
        this.id = id;
    }
    public void setFirstDayHired(Date firstDayHired) {
        this.firstDayHired = firstDayHired;
    } 
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
