package version1;

/**
 *
 * @author Nathaniel
 */
public class FlatRateDiscount implements Discount{
    private double flatRateDiscount;
    
    public FlatRateDiscount(double discount){
        setFlatRateDiscount(discount);
    }

    public void setFlatRateDiscount(double flatRateDiscount) {
        // need to write some validation
        this.flatRateDiscount = flatRateDiscount;
    }
    
    @Override
    public double getDiscount(double numProducts) {
         return flatRateDiscount;
    }
    
}
