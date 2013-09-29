package version1;

/**
 *
 * @author Nathaniel
 */
public interface Product {
    /**
     *
     * @return
     */
    public abstract String getProductID();
    
    /**
     *
     * @param numProducts
     * @return
     */
    public abstract double getProductDiscount(final double numProducts);
    
    /**
     *
     * @return
     */
    public abstract double getProductPrice();
    
    /**
     *
     * @return
     */
    public abstract String getProductName();
}
