package assignment4;
import java.util.Date;
import java.util.Objects;

/**
 * Simple class for a regular employee in employee
 * @author maria ramlochan
 */
public class RegularEmployees extends Employee {
    //Data members
    protected String educationLevel;
    protected double employeeSalary;

    /**
     * Default constructor
     */
    public RegularEmployees() {
        this.educationLevel = "";
        this.employeeSalary = 13.10;
    }

    /**
     * Constructor with all data members
     * @param educationLevel the education level of an employee
     * @param employeeSalary the employee's salary
     * @param id the ID of employees and manager
     * @param firstDateHired the first day employees and manger were hired
     * @param hoursWorked the number of hours worked
     * @param name name of the employees and clients
     * @param gender gender of the employees and clients
     * @param age age of employees and clients
     * @param email email of the employees and clients
     * @param address address of the employees and clients
     */
    public RegularEmployees(String educationLevel, double employeeSalary, String id,
            Date firstDateHired, int hoursWorked, String name, String gender,
            int age, String email, Address address) {
        super(id, firstDateHired, hoursWorked, name, gender, age, email, address);
        this.educationLevel = educationLevel;
        this.employeeSalary = employeeSalary;
    }

    /**
     * Copy constructor
     * @param regularEmployees 
     */
    public RegularEmployees(RegularEmployees regularEmployees) {
        super(regularEmployees);
        this.educationLevel = regularEmployees.educationLevel;
        this.employeeSalary = regularEmployees.employeeSalary;
    }
    
    /**
     * Method to calculate the salary of a regular employee
     * @return employee's salary multiplied by the hours worked
     */
    @Override
    protected double paycheck() {
        return employeeSalary * hoursWorked;
    }

    //HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + super.hashCode();
        hash = 47 * hash + Objects.hashCode(this.educationLevel);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.employeeSalary) ^
                (Double.doubleToLongBits(this.employeeSalary) >>> 32));
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
        final RegularEmployees other = (RegularEmployees) obj;
        if (!super.equals(obj))
            return false;
        if (Double.doubleToLongBits(this.employeeSalary) != Double.doubleToLongBits(other.employeeSalary)) {
            return false;
        }
        if (!Objects.equals(this.educationLevel, other.educationLevel)) {
            return false;
        }
        return true;
    }

    //ToString
    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("%-10s: %s\n", "Education Level: ", educationLevel);
        str += String.format("%-10s: %s\n\n", "Employee's Salary: ", paycheck());
        return str;
    }

    //Getters
    public String getEducationLevel() {
        return educationLevel;
    }
    public double getEmployeeSalary() {
        return employeeSalary;
    }

    //Setters
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }
    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    } 
}
