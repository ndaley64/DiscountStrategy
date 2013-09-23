/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author Nathaniel
 */
public class InStoreLineItem implements LineItem{
    private Product product;
    private DataAccess dataAccess;
    
    private int quantity;
    private double ttlDiscount;
    private double ttlCost;
    
    public InStoreLineItem(String productID){
        product = dataAccess.findProduct(productID);
        quantity = 1;
    }

    public void increaseQuantity() {
        quantity++;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTtlDiscount() {
        ttlDiscount = product.getProductDiscount(quantity);
        return ttlDiscount;
    }

    public double getTtlCost() {
        ttlCost = product.getPrice() * quantity;
        return ttlCost;
    }

    @Override
    public void printLineItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
