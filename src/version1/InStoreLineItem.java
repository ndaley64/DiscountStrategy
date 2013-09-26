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
    private final int ID_COL_LENGTH = 7;
    private final int NAME_COL_LENGTH = 15;
    private final int QUANTITY_COL_LENGTH = 6;
    private final int SUBTOTAL_COL_LENGTH = 10;
    private final int DISCOUNT_COL_LENGTH = 9;
    
    private int idColSpacing;
    private int nameColSpacing;
    private int quantityColSpacing;
    private int subtotalColSpacing;
    private int discountColSpacing;
    
    private Product product;
    private DataAccess dataAccess;
    
    private int quantity;
    private double ttlDiscount;
    private double ttlCost;
    
    public InStoreLineItem(String productID){
        dataAccess = new DatabaseDataAccess();
        product = dataAccess.findProduct(productID);
        quantity = 1;
    }

    @Override
    public void increaseQuantity() {
        quantity++;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getTtlDiscount() {
        ttlDiscount = product.getProductDiscount(quantity) * getTtlCost();
        ttlDiscount = (double)Math.round(ttlDiscount * 100) / 100;
        return ttlDiscount;
    }

    @Override
    public double getTtlCost() {
        ttlCost = product.getProductPrice() * quantity;
        ttlCost = (double)Math.round(ttlCost * 100) / 100;
        return ttlCost;
    }

    @Override
    public void printLineItem() {
        idColSpacing = ID_COL_LENGTH - product.getProductID().length();
        nameColSpacing = NAME_COL_LENGTH - product.getProductName().length();
        
        System.out.print(product.getProductID());
        for(int i = 0; i < idColSpacing; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.print(product.getProductName());
        for(int i = 0; i < nameColSpacing; i++){
            System.out.print(" ");
        }
        System.out.print("|");
        
        if(quantity < 10){
            System.out.print("  ");
            System.out.print(quantity);
            System.out.print("   |$");
        }
        System.out.print(ttlCost);
        System.out.print("| -$");
        System.out.println(ttlDiscount);
    }

    @Override
    public boolean checkForDuplicate(String productID) {
        if(product.getProductID().equals(productID)){
            increaseQuantity();
            return true;
        }else{
            return false;
        }
    }
    
}
