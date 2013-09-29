package version1;

/**
 *
 * @author Nathaniel
 */
public interface Receipt {
    /**
     *
     */
    public abstract void outputReceipt();
    
    /**
     *
     * @param productID
     */
    public abstract void addProduct(final String productID);
}
