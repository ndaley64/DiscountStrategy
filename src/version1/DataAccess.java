/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author ndaley
 */
public interface DataAccess {

    Customer findCustomer(String customerID);

    Product findProduct(String productID);
    
}
