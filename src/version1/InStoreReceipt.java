package version1;

/**
 *
 * @author Nathaniel
 */
public class InStoreReceipt implements Receipt{
    private DataAccess dataAcess;
    private LineItem[] lineItems;

    public InStoreReceipt(DataAccess dataAcess) {
        this.dataAcess = dataAcess;
    }
    
    @Override
    public void outputReceipt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addProduct(String productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
