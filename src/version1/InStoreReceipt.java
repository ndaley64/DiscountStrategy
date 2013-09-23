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
        LineItem lineItem = new InStoreLineItem(productID);
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length-1] = lineItem;
        lineItems = temp;
    }
    
}
