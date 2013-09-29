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
    private final int DOLLAR_SIGN_DISPLACEMENT = 1;
    
    private final int MONEY_ROUNDING = 100;
    private final int QUANTITY_INITIALIZER = 1;
    
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
    
    /**
     *
     * @param productID
     */
    public InStoreLineItem(final String productID){
        dataAccess = new DatabaseDataAccess();
        product = dataAccess.findProduct(productID);
        quantity = QUANTITY_INITIALIZER;
    }

    /**
     *
     */
    @Override
    public void increaseQuantity() {
        quantity++;
    }

    /**
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public double getTtlDiscount() {
        ttlDiscount = product.getProductDiscount(quantity) * getTtlCost();
        ttlDiscount = (double)Math.round(ttlDiscount * MONEY_ROUNDING) / MONEY_ROUNDING;
        return ttlDiscount;
    }

    /**
     *
     * @return
     */
    @Override
    public double getTtlCost() {
        ttlCost = product.getProductPrice() * quantity;
        ttlCost = (double)Math.round(ttlCost * MONEY_ROUNDING) / MONEY_ROUNDING;
        return ttlCost;
    }

    /**
     *
     */
    @Override
    public void printLineItem() {
        idColSpacing = ID_COL_LENGTH - product.getProductID().length();
        nameColSpacing = NAME_COL_LENGTH - product.getProductName().length();
        quantityColSpacing = ((QUANTITY_COL_LENGTH/2) + 1) - Integer.toString(quantity).length();
        subtotalColSpacing = (SUBTOTAL_COL_LENGTH - Double.toString(ttlCost).length()) - DOLLAR_SIGN_DISPLACEMENT;
        discountColSpacing = (DISCOUNT_COL_LENGTH - Double.toString(ttlDiscount).length()) -DOLLAR_SIGN_DISPLACEMENT;
        
        System.out.print(product.getProductID());
        for(int i = 0; i < idColSpacing; i++){
            System.out.print(" ");
        }
        
        System.out.print("|" + product.getProductName());
        for(int i = 0; i < nameColSpacing; i++){
            System.out.print(" ");
        }
        
        System.out.print("|  " + quantity);
        for(int i = 0; i < quantityColSpacing; i++){
            System.out.print(" ");
        }
        
        System.out.print("|");
        for(int i = 0; i < subtotalColSpacing; i++){
            System.out.print(" ");
        }
        System.out.print("$" + ttlCost);
        
        System.out.print("|");
        for(int i = 0; i < discountColSpacing; i++){
            System.out.print(" ");
        }
        System.out.println("$" + ttlDiscount);
    }

    /**
     *
     * @param productID
     * @return
     */
    @Override
    public boolean checkForDuplicate(final String productID) {
        if(product.getProductID().equals(productID)){
            increaseQuantity();
            return true;
        }else{
            return false;
        }
    }
    
}
