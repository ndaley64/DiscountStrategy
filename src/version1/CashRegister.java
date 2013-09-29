package version1;
/**
 *
 * @author Nathaniel
 */
public class CashRegister {
    private Receipt receipt;
    
    /**
     *
     */
    public CashRegister(){
    }
    
    /**
     *
     * @param customerID
     */
    public void startSale(final String customerID){
        // need to add some validation here or in DataAccess
        receipt = new InStoreReceipt(customerID);
    }
    
    /**
     *
     * @param productID
     */
    public void inputProduct(final String productID){
        // need to add some validation here or in DataAccess
        receipt.addProduct(productID);
    }
    
    /**
     *
     */
    public void finalizeSale(){
        receipt.outputReceipt();
    }
}
