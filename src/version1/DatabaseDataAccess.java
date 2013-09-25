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
    
    public DatabaseDataAccess() {
        globalCustomerDatabase = new GlobalCustomerDatabase();
        storeProductDatabase = new StoreProductDatabase();
    }
    
    @Override
    public Product findProduct(String productID){
        return storeProductDatabase.retrieveProduct(productID);
    }
    
    @Override
    public Customer findCustomer(String customerID){
        return globalCustomerDatabase.retrieveCustomer(customerID);
    }
}
