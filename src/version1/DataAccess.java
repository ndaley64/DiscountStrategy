/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author Nathaniel
 */
public class DataAccess {
    GlobalCustomerDatabase globalCustomerDatabase;
    StoreProductDatabase storeProductDatabase;
    
    Product product;
    
    public DataAccess() {
        globalCustomerDatabase = new GlobalCustomerDatabase();
        storeProductDatabase = new StoreProductDatabase();
    }
    
    public Product findProduct(String productID){
        product = storeProductDatabase.retrieveProduct(productID);
        
        if(product == null){
            System.out.println("Error!");
        }
        
        return storeProductDatabase.retrieveProduct(productID);
    }
    
    public Customer findCustomer(String customerID){
        return globalCustomerDatabase.retrieveCustomer(customerID);
    }
}
