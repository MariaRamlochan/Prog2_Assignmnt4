package assignment4;
import java.util.Date;
import java.util.Objects;

/**
 * Simple class for client in a department
 * @author maria ramlochan
 */
public class Client extends Department implements Parking{
    //Data members
    protected double productCost;
    protected Date purchaseDate;

    /**
     * Default constructor
     */
    public Client() {
        super();
        this.productCost = 0;
        this.purchaseDate = new Date();
    }

    /**
     * Constructor with all data members
     * @param productCost the cost of the product
     * @param purchaseDate the date when the product was purchase
     * @param name name of the employees and clients
     * @param gender gender of the employees and clients
     * @param age age of employees and clients
     * @param email email of the employees and clients
     * @param address address of the employees and clients
     */
    public Client(double productCost, Date purchaseDate, String name, String gender,
            int age, String email, Address address) {
        super(name, gender, age, email, address);
        this.productCost = productCost;
        this.purchaseDate = purchaseDate;
    }

    /**
     * Copy constructor
     * @param client the client
     */
    public Client(Client client) {
        super(client);
        this.productCost = client.productCost;
        this.purchaseDate = client.purchaseDate;
    }
    
    @Override
    public void regesterCar() {
         System.out.println("Car registered for client");
    }
    
    //HashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.productCost) ^ 
                (Double.doubleToLongBits(this.productCost) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.purchaseDate);
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
        final Client other = (Client) obj;
        if (!super.equals(obj))
            return false;
        if (this.productCost != other.productCost) {
            return false;
        }
        if (!Objects.equals(this.purchaseDate, other.purchaseDate)) {
            return false;
        }
        return true;
    }
    
    //ToString
    @Override
    public String toString() {
        String str = "";
        str += String.format("%-10s: %s\n", "Product Cost: ", productCost);
        str += String.format("%-10s: %s\n", "Purchase Date: ", purchaseDate);
        return str;
    }

    //Getters
    public double getProductCost() {
        return productCost;
    }
    public Date getPurchaseDate() {
        return purchaseDate;
    }
    
    //Setters
    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    } 
}
