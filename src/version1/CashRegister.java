package version1;
/**
 *
 * @author Nathaniel
 */
public class CashRegister {
    private Receipt receipt;
    private DataAccess dataAccess;
    
    public CashRegister(GlobalCustomerDatabase cd, StoreProductDatabase pd, DataAccess da){
        dataAccess = da;
    }
    
    public void startSale(String customerID){
        // need to add some validation here or in DataAccess
        receipt = new InStoreReceipt(dataAccess);
    }
    
    public void inputProduct(String productID){
        // need to add some validation here or in DataAccess
    }
    
    public void finalizeSale(){
        receipt.outputReceipt();
    }
}
