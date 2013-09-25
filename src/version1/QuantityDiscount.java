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
        if(quantityLimit < 1){
            throw new IllegalArgumentException("The quantity limit is too small");
        }
        this.quantityLimit = quantityLimit;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        if(discountAmount > 1 || discountAmount < 0){
            throw new IllegalArgumentException("Illegal discount amount.");
        }
        
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
