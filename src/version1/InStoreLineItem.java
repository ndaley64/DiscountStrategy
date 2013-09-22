/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author Nathaniel
 */
public class InStoreLineItem {
    private Product product;
    private DataAccess dataAccess;
    
    private int quantity;
    private int ttlDiscount;
    private int ttlCost;
    
    public InStoreLineItem(String productID){
        
        quantity = 1;
    }

    public void increaseQuantity() {
        quantity++;
    }
}
