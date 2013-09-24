package version1;

/**
 *
 * @author Nathaniel
 */
public interface LineItem {
    public abstract void printLineItem();
    
    public abstract double getTtlCost();
    
    public abstract double getTtlDiscount();
}
