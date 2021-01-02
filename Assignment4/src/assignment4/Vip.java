package assignment4;
import java.util.Date;
import java.util.Objects;

/**
 * Simple class for VIP in client
 * @author maria ramlochan
 */
public class Vip extends Client {
    //Data members
    protected Date membershipYear;

    /**
     * Default constructor
     */
    public Vip() {
        super();
        this.membershipYear = new Date();
    }

    /**
     * Constructor with all data members
     * @param membershipYear the year of the membership of a VIP
     * @param productCost the cost of the product
     * @param purchaseDate the date when the product was purchase
     * @param name name of the employees and clients
     * @param gender gender of the employees and clients
     * @param age age of employees and clients
     * @param email email of the employees and clients
     * @param address address of the employees and clients
     */
    public Vip(Date membershipYear, double productCost, Date purchaseDate, String name,
            String gender, int age, String email, Address address) {
        super(productCost, purchaseDate, name, gender, age, email, address);
        this.membershipYear = membershipYear;
    }

    /**
     * Copy constructor
     * @param vip the VIP
     */
    public Vip(Vip vip) {
        super(vip);
        this.membershipYear = vip.membershipYear;
    }
    
    /**
     * Method to calculate 30% discount on the total product cost
     * @return the product cost multiplied by 0.3 for a 30% discount
     */
    public double discount() {
        return productCost * 0.3;
    }

    //HashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + super.hashCode();
        hash = 53 * hash + Objects.hashCode(this.membershipYear);
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
        final Vip other = (Vip) obj;
        if (!super.equals(obj))
            return false;
        if (this.membershipYear != other.membershipYear) {
            return false;
        }
        return true;
    }

    //ToString
    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("%-10s: %s\n", "Membership Year", membershipYear);
        str += String.format("%-10s: %s\n", "Product Cost with VIP discount",
                discount());
        return str;
    }

    //Getters
    public Date getMembershipYear() {
        return membershipYear;
    }

    //Setters
    public void setMembershipYear(Date membershipYear) {
        this.membershipYear = membershipYear;
    } 
}
