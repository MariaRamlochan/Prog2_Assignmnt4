package assignment4;
import java.util.Objects;

/**
 * Simple class for a department
 * @author maria ramlochan
 */
public class Department {
    //Data members
    protected String name;
    protected String gender;
    protected int age;
    protected String email;
    protected Address address;
    
    /**
     * Default constructor
     */
    public Department() {
        this.name = "";
        this.gender = "";
        this.age = 0;
        this.email = "";
        this.address = new Address();
    }
    
    /**
     * Constructor with all data members
     * @param name name of the employees and clients
     * @param gender gender of the employees and clients
     * @param age age of employees and clients
     * @param email email of the employees and clients
     * @param address address of the employees and clients
     */
    public Department(String name, String gender, int age, String email, 
            Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.address = address;
    }
    
    /**
     * Copy constructor
     * @param department the department
     */
    public Department(Department department) {
        this.name = department.name;
        this.gender = department.gender;
        this.age = department.age;
        this.email = department.email;
        this.address = new Address(department.address);
    }
    
    //HashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.gender);
        hash = 89 * hash + this.age;
        hash = 89 * hash + Objects.hashCode(this.email);
        hash = 89 * hash + Objects.hashCode(this.address);
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
        final Department other = (Department) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return true;
    }
    
    //ToString
    @Override
    public String toString() {
        String str = "";
        str += String.format("%-10s: %s\n", "Name: ", name);
        str += String.format("%-10s: %s\n", "Gender: ", gender);
        str += String.format("%-10s: %s\n", "Age: ", age);
        str += String.format("%-10s: %s\n", "Email: ", email);        
        str += String.format("%-10s: %s\n", "Address: ", address); 
        return str;
    }
    
    //Getters
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public Address getAddress() {
        return address;
    }
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(Address address) {
        this.address = address;
    } 
}
