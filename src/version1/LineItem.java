package version1;

/**
 *
 * @author Nathaniel
 */
public interface LineItem {
    /**
     *
     */
    public abstract void printLineItem();
    
    /**
     *
     * @return
     */
    public abstract double getTtlCost();
    
    /**
     *
     * @return
     */
    public abstract double getTtlDiscount();
    
    /**
     *
     * @param productID
     * @return
     */
    public abstract boolean checkForDuplicate(final String productID);
    
    /**
     *
     */
    public abstract void increaseQuantity();
}
