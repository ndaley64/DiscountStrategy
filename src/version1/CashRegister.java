package version1;
/**
 *
 * @author Nathaniel
 */
public class CashRegister {
    private Receipt receipt;
    
    public CashRegister(){
    }
    
    public void startSale(String customerID){
        // need to add some validation here or in DataAccess
        receipt = new InStoreReceipt();
    }
    
    public void inputProduct(String productID){
        // need to add some validation here or in DataAccess
    }
    
    public void finalizeSale(){
        receipt.outputReceipt();
    }
}
