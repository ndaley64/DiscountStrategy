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

    /**
     *
     * @param customerID
     * @return
     */
    Customer findCustomer(final String customerID);

    /**
     *
     * @param productID
     * @return
     */
    Product findProduct(final String productID);
    
}
