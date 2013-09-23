package version1;

/**
 *
 * @author Nathaniel
 */
public class SeasonalDiscount implements Discount{
    private double SeasonalDiscount;
    
    public SeasonalDiscount(double discount){
        setSeasonalDiscount(discount);
    }

    public void setSeasonalDiscount(double SeasonalDiscount) {
        // need to write some validation
        this.SeasonalDiscount = SeasonalDiscount;
    }
    
    @Override
    public double getDiscount(double numProducts) {
         return SeasonalDiscount;
    }
    
}
