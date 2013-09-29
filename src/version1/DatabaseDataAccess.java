/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author Nathaniel
 */
public class DatabaseDataAccess implements DataAccess {
    GlobalCustomerDatabase globalCustomerDatabase;
    StoreProductDatabase storeProductDatabase;
    
    /**
     *
     */
    public DatabaseDataAccess() {
        globalCustomerDatabase = new GlobalCustomerDatabase();
        storeProductDatabase = new StoreProductDatabase();
    }
    
    /**
     * 
     * @param productID
     * @return 
     */
    @Override
    public Product findProduct(final String productID){
        return storeProductDatabase.retrieveProduct(productID);
    }
    
    /**
     * 
     * @param customerID
     * @return 
     */
    @Override
    public Customer findCustomer(final String customerID){
        return globalCustomerDatabase.retrieveCustomer(customerID);
    }
}
