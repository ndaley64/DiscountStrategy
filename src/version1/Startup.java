package version1;
/**
 *
 * @author Nathaniel
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Add multiple seasonal and Quantity discounts
        Database productDatabase = new ProductDatabase();
        Database customerDatabase = new CustomerDatabase();
        
        //DataAccess dataAccess = new DataAccess(customerDatabase, productDatabase);
    }
}
