package version1;

/**
 *
 * @author Nathaniel
 */
public class FlatRateDiscount implements Discount{
    private double flatRateDiscount;
    
    /**
     *
     * @param discount
     */
    public FlatRateDiscount(final double discount){
        setFlatRateDiscount(discount);
    }

    /**
     *
     * @param flatRateDiscount
     */
    public void setFlatRateDiscount(final double flatRateDiscount) {
        // need to write some validation
        this.flatRateDiscount = flatRateDiscount;
    }
    
    /**
     * 
     * @param numProducts
     * @return 
     */
    @Override
    public double getDiscount(final double numProducts) {
         return flatRateDiscount;
    }
    
}
