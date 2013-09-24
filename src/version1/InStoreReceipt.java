package version1;

/**
 *
 * @author Nathaniel
 */
public class InStoreReceipt implements Receipt{
    private DataAccess dataAcess;
    private LineItem[] lineItems;
    private double totalCost;
    private double totalDiscount;

    public InStoreReceipt(DataAccess dataAcess) {
        this.dataAcess = dataAcess;
    }
    
    @Override
    public void outputReceipt() {
        for(LineItem i : lineItems){
            totalCost += i.getTtlCost();
            totalDiscount += i.getTtlDiscount();
        }
        System.out.println("Print receipt...");
        System.out.println("TARGET");
        System.out.println("---------------------------------------------------");
        System.out.println("ID No.  | Name    |Quantity| Price | Discount  " );
        System.out.println("---------------------------------------------------");
        for(LineItem i : lineItems){
            i.printLineItem();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("                                              Total");
        System.out.print("                                     ");
        System.out.println(totalCost - totalDiscount);
        System.out.println("---------------------------------------------------");
        System.out.println("Thank you for shopping at Target!");
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
