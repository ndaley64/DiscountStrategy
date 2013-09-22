package version1;

/**
 *
 * @author Nathaniel
 */
public class NonDiscount implements Discount{
    private final double NO_DISCOUNT = 0;
    
    @Override
    public double getDiscount(double numProducts) {
        return NO_DISCOUNT;
    }
    
}
