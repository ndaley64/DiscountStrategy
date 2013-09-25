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
        dataAccess = new DataAccess();
        product = dataAccess.findProduct(productID);
        quantity = 1;
    }

    public void increaseQuantity() {
        quantity++;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getTtlDiscount() {
        ttlDiscount = product.getProductDiscount(quantity);
        return ttlDiscount;
    }

    @Override
    public double getTtlCost() {
        ttlCost = product.getProductPrice() * quantity;
        return ttlCost;
    }

    @Override
    public void printLineItem() {
        System.out.println(product.getProductID() + " | " + product.getProductName() + " | "
                + quantity + " | " + ttlCost + " | " + ttlDiscount);
    }
    
}
