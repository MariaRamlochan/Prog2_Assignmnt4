package assignment4;
import java.util.Date;

/**
 * Simple class for regular client in client
 * @author maria ramlochan
 */
public class RegularClient extends Client{
    /**
     * Default constructor
     */
    public RegularClient() {
        super();
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
    public RegularClient(int productCost, Date purchaseDate, String name,
            String gender, int age, String email, Address address) {
        super(productCost, purchaseDate, name, gender, age, email, address);
    }

    /**
     * Copy constructor
     * @param regularClient a regular client
     */
    public RegularClient(RegularClient regularClient) {
        super(regularClient);
    } 
}
