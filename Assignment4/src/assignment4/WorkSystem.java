package assignment4;
import java.util.ArrayList;
import java.util.Date;

/**
 * Simple class for ArrayList in a Work System
 * @author maria ramlochan
 */
public class WorkSystem {

    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Few variables to test out for a regular employee
        WorkSystem emp = new WorkSystem();
        WorkSystem vip = new WorkSystem();
        emp.addEmployee("University", null, 45, "Yi", "male", 35, "yi@gmail.com", 
                null);
        emp.addEmployee("College", null, 20, "Maria", "female", 20, "maria@gmail.com",
                null);
        emp.addEmployee("College", null, 25, "Samuel", "male", 23, "samuel@gmail.com",
                null);
        emp.addEmployee("High School", null, 10, "Aiden", "male", 18, "aiden@gmail.com",
                null);
        vip.addVip(null, null, "Steve", "male", 21, "st@gmail.com", null);
        vip.addVip(null, null, "Dave", "male", 56, "dave@gmail.com", null);
        vip.addVip(null, null, "John", "male", 32, "john@gmail.com", null);
        vip.addVip(null, null, "Mike", "male", 24, "mike@gmail.com", null);
        
        System.out.println(emp.employees);
        System.out.println(vip.vips);
    }
    
    //Data members
    private ArrayList<RegularEmployees> employees;
    private ArrayList<Vip> vips;
    private static int empNextId = 74516;

    /**
     * Default constructor
     */
    public WorkSystem() {
        this.employees = new ArrayList<>();
        this.vips = new ArrayList<>();
    }
    
    /**
     * Constructor with all data members
     * @param employees employees in an ArrayList
     * @param vips VIPs in an ArrayList
     */
    public WorkSystem(ArrayList<RegularEmployees> employees, ArrayList<Vip> vips) {
        this.employees = employees;
        this.vips = vips;
    }
    
    /**
     * Copy constructor
     * @param workSystem a workSystem
     */
    public WorkSystem(WorkSystem workSystem) {
        this.employees = new ArrayList<>(workSystem.employees);
        this.vips = new ArrayList<>(workSystem.vips);
    }
    
    /**
     * Method to check if a a new employee has all perimeter/data members required
     * @param educationLevel the education level of an employee
     * @param firstDateHired the first day employee were hired
     * @param hoursWorked the number of hours worked
     * @param name name of the employee
     * @param gender gender of the employee
     * @param age age of employee
     * @param email email of the employee
     * @param address address of the employee
     * @return true if all conditions are met
     */
    public boolean addEmployee(String educationLevel,
            Date firstDateHired, int hoursWorked, String name, String gender,
            int age, String email, Address address) {
        String id = String.format("%05d", empNextId++);
        double employeeSalary = new RegularEmployees().getEmployeeSalary();
        RegularEmployees employee = new RegularEmployees(educationLevel, 
                employeeSalary, id, firstDateHired, hoursWorked, name, gender, age,
                email, address);
        employees.add(employee);
        return true;
    }
    
    /**
     * Method to check if a a new VIP has all perimeter/data members required
     * @param membershipYear the year of the membership of a VIP
     * @param purchaseDate the date when the product was purchase
     * @param name name of the client
     * @param gender gender of the client
     * @param age age of the client
     * @param email email of the client
     * @param address address of the client
     * @return true if all conditions are met
     */
    public boolean addVip(Date membershipYear, Date purchaseDate, 
            String name, String gender, int age, String email, Address address) {
        double productCost = new Vip().getProductCost();
        Vip vip = new Vip(membershipYear, productCost, purchaseDate, name, gender, age, email, 
                address);
        vips.add(vip);
        return true;
    }
}
