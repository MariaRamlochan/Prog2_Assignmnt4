package assignment4;
import java.util.Objects;

/**
 * Simple class for address
 * @author maria ramlochan
 */
public class Address {
   
    //Data members
    private String street;
    private int streetNum;
    private String city;
    private String zipCode;
    
    /**
     * Default constructor
     */
    public Address() {
        this.street = "";
        this.streetNum = 0;
        this.city = "";
        this.zipCode = "";
    }
    
    /**
     * Constructor with all data members
     * @param street
     * @param streetNum
     * @param city
     * @param zipCode 
     */
    public Address(String street, int streetNum, String city, String zipCode) {
        this.street = street;
        this.streetNum = streetNum;
        this.city = city;
        this.zipCode = zipCode;
    }
    
    /**
     * Copy constructor
     * @param address 
     */
    public Address(Address address) {
        this.street = address.street;
        this.streetNum = address.streetNum;
        this.city = address.city;
        this.zipCode = address.zipCode;
    }
    
    //HashCode
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Address other = (Address) obj;
        if (this.streetNum != other.streetNum) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.zipCode, other.zipCode)) {
            return false;
        }
        return true;
    }
    
    //ToString
    @Override
    public String toString() {
        String str = "";
        str += String.format("%-10s: %s\n", "Street", street);
        str += String.format("%-10s: %s\n", "Street Number", streetNum);
        str += String.format("%-10s: %s\n", "City", city);
        str += String.format("%-10s: %s\n", "Zip Code", zipCode);        
        return str;
    }
    
    //Getters
    public String getStreet() {
        return street;
    }
    public int getStreetNum() {
        return streetNum;
    }
    public String getCity() {
        return city;
    }
    public String getZipCode() {
        return zipCode;
    }

    //Setters
    public void setStreet(String street) {
        this.street = street;
    }
    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    } 
}
