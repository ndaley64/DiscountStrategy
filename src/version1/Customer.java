/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author Nathaniel
 */
public interface Customer {
    
    /**
     *
     * @return
     */
    public abstract String getCustomerID();
    
    /**
     *
     * @return
     */
    public abstract double getCustomerDiscount();
    
    /**
     *
     * @return
     */
    public abstract double getCustomerTax();
}
