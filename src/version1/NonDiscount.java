package version1;

/**
 *
 * @author Nathaniel
 */
public class NonDiscount implements Discount{
    private final double NO_DISCOUNT = 0;
    
    /**
     * 
     * @param numProducts
     * @return 
     */
    @Override
    public double getDiscount(final double numProducts) {
        return NO_DISCOUNT;
    }
    
}
