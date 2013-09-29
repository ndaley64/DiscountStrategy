package version1;

/**
 *
 * @author Nathaniel
 */
public class QuantityDiscount implements Discount{
    private int quantityLimit;
    private double discountAmount;
    
    /**
     *
     * @param quantityLimit
     * @param discountAmount
     */
    public QuantityDiscount(final int quantityLimit, final double discountAmount){
        setQuantityLimit(quantityLimit);
        setDiscountAmount(discountAmount);
    }

    /**
     *
     * @return
     */
    public int getQuantityLimit() {
        return quantityLimit;
    }

    /**
     *
     * @param quantityLimit
     */
    public void setQuantityLimit(final int quantityLimit) {
        if(quantityLimit < 1){
            throw new IllegalArgumentException("The quantity limit is too small");
        }
        this.quantityLimit = quantityLimit;
    }

    /**
     *
     * @return
     */
    public double getDiscountAmount() {
        return discountAmount;
    }

    /**
     *
     * @param discountAmount
     */
    public void setDiscountAmount(final double discountAmount) {
        if(discountAmount > 1 || discountAmount < 0){
            throw new IllegalArgumentException("Illegal discount amount.");
        }
        
        this.discountAmount = discountAmount;
    }
    
    /**
     * 
     * @param numProducts
     * @return 
     */
    @Override
    public double getDiscount(final double numProducts) {
        if(numProducts >= 3){
            return .25;
        }else{
            return 0;
        }
    }
    
}
