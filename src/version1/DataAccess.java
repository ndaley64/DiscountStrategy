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
    CustomerDatabase customerDatabase;
    ProductDatabase productDatabase;

    public DataAccess(CustomerDatabase customerDatabase, ProductDatabase productDatabase) {
        this.customerDatabase = customerDatabase;
        this.productDatabase = productDatabase;
    }
    
    public Product findProduct(String productID){
        return productDatabase.retrieveProduct(productID);
    }
    
    public Customer findCustomer(String customerID){
        return customerDatabase.retrieveCustomer(customerID);
    }
}
