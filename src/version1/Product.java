package version1;

/**
 *
 * @author Nathaniel
 */
public interface Product {
    public abstract String getProductID();
    
    public abstract double getProductDiscount(double numProducts);
    
    public abstract double getPrice();
}
