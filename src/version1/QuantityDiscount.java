package version1;

/**
 *
 * @author Nathaniel
 */
public class QuantityDiscount implements Discount{
    private int quantityLimit;
    private double discountAmount;
    
    public QuantityDiscount(int quantityLimit, double discountAmount){
        setQuantityLimit(quantityLimit);
        setDiscountAmount(discountAmount);
    }

    public int getQuantityLimit() {
        return quantityLimit;
    }

    public void setQuantityLimit(int quantityLimit) {
        // need some validation
        this.quantityLimit = quantityLimit;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        // need some validation
        this.discountAmount = discountAmount;
    }
    
    @Override
    public double getDiscount(double numProducts) {
        if(numProducts >= 3){
            return .25;
        }else{
            return 0;
        }
    }
    
}
