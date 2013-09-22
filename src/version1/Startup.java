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
        CustomerDatabase cd = new CustomerDatabase();
        cd.addCustomer(null);
    }
}
