package version1;

/**
 *
 * @author Nathaniel
 */
public class QuantityDiscount implements Discount{
    
    @Override
    public double getDiscount(double numProducts) {
        if(numProducts > 3){
            return .25;
        }else{
            return 0;
        }
    }
    
}
