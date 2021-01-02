package assignment4;
import java.util.Date;
import java.util.Objects;

/**
 * Simple class for manager in employee
 * @author maria ramlochan
 */
public class Manager extends Employee {
    //Data members
    protected String reponsibility;
    protected double managerSalary;

    /**
     * Default constructor
     */
    public Manager() {
        this.reponsibility = "";
        this.managerSalary = 16.10;
    }

    /**
     * Constructor with all data members
     * @param reponsibility the responsibility a manager has
     * @param managerSalary the salary a manager has
     * @param id the ID of employees and manager
     * @param firstDateHired the first day employees and manger were hired
     * @param hoursWorked the number of hours worked
     * @param name name of the employees and clients
     * @param gender gender of the employees and clients
     * @param age age of employees and clients
     * @param email email of the employees and clients
     * @param address address of the employees and clients
     */
    public Manager(String reponsibility, double managerSalary, String id,
            Date firstDateHired, int hoursWorked, String name, String gender, 
            int age, String email, Address address) {
        super(id, firstDateHired, hoursWorked, name, gender, age, email, address);
        this.reponsibility = reponsibility;
        this.managerSalary = managerSalary;
    }

    /**
     * Copy constructor
     * @param manager the manager
     */
    public Manager(Manager manager) {
        super(manager);
        this.reponsibility = manager.reponsibility;
        this.managerSalary = manager.managerSalary;
    }
    
     /**
     * Method to calculate the salary of a manager
     * @return the manager's salary multiplied by the hours worked
     */
    @Override
    protected double paycheck() {
        return managerSalary * hoursWorked;
    }

    //HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + super.hashCode();
        hash = 17 * hash + Objects.hashCode(this.reponsibility);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.managerSalary) ^
                (Double.doubleToLongBits(this.managerSalary) >>> 32));
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
        final Manager other = (Manager) obj;
        if (!super.equals(obj))
            return false;
        if (Double.doubleToLongBits(this.managerSalary) != 
                Double.doubleToLongBits(other.managerSalary)) {
            return false;
        }
        if (!Objects.equals(this.reponsibility, other.reponsibility)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("%-10s: %s\n", "Responsibility: ", reponsibility);
        str += String.format("%-10s: %s\n", "Manager's Salary: ", paycheck());
        return str;
    }

    //Getters
    public String getReponsibility() {
        return reponsibility;
    }
    public double getManagerSalary() {
        return managerSalary;
    }

    //Setters
    public void setReponsibility(String reponsibility) {
        this.reponsibility = reponsibility;
    }
    public void setManagerSalary(double managerSalary) {
        this.managerSalary = managerSalary;
    } 
}
