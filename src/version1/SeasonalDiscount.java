package version1;

/**
 *
 * @author Nathaniel
 */
public class SeasonalDiscount implements Discount{
    private double SeasonalDiscount;
    
    /**
     *
     * @param discount
     */
    public SeasonalDiscount(final double discount){
        setSeasonalDiscount(discount);
    }

    /**
     *
     * @param SeasonalDiscount
     */
    public void setSeasonalDiscount(final double SeasonalDiscount) {
        // need to write some validation
        this.SeasonalDiscount = SeasonalDiscount;
    }
    
    /**
     * 
     * @param numProducts
     * @return 
     */
    @Override
    public double getDiscount(final double numProducts) {
         return SeasonalDiscount;
    }
    
}
