package version1;

/**
 *
 * @author Nathaniel
 */
public class InStoreReceipt implements Receipt{
    private LineItem[] lineItems;
    private double subTotal = 0;
    private double total = 0;
    private double totalDiscount = 0;

    public InStoreReceipt() {
       lineItems = new LineItem[0];
    }
    
    @Override
    public void outputReceipt() {
        for(LineItem i : lineItems){
            subTotal += i.getTtlCost();
            totalDiscount += i.getTtlDiscount();
            
        }
        subTotal = (double)Math.round(subTotal * 100) / 100;
        totalDiscount = (double)Math.round(totalDiscount * 100) / 100;
        total = (double)Math.round((subTotal - totalDiscount) * 100) / 100;
        
        System.out.println("Print receipt...");
        System.out.println("TARGET");
        System.out.println("---------------------------------------------------");
        System.out.println("ID No.  | Name    |Quantity| SubTotal | Discount  " );
        System.out.println("---------------------------------------------------");
        for(LineItem i : lineItems){
            i.printLineItem();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("                                           SubTotal");
        System.out.print("                                             ");
        System.out.println(subTotal);
        System.out.println("                                       TotalDiscount");
        System.out.print("                                              ");
        System.out.println(totalDiscount);
        System.out.println("                                              Total");
        System.out.print("                                             ");
        System.out.println(total - totalDiscount);
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
