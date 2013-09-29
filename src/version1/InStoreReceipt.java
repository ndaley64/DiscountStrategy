package version1;

/**
 *
 * @author Nathaniel
 */
public class InStoreReceipt implements Receipt{
    private DataAccess dataAccess;
    private Customer customer;
    private LineItem[] lineItems;
    private double subTotal;
    private double customerDiscount;
    private double customerTax;
    private double totalDiscount ;
    private double totalWithDiscountAndTax;
    
    private final int PRINTING_COL_LENGTH = 51;
    private final int NEGATIVE_DISPLACEMENT = 2;
    private final int MONEY_ROUNDING = 100;

    public InStoreReceipt(String customerID) {
       lineItems = new LineItem[0];
       dataAccess = new DatabaseDataAccess();
       customer = dataAccess.findCustomer(customerID);
    }
    
    @Override
    public void outputReceipt() {
        for(LineItem i : lineItems){
            subTotal += i.getTtlCost();
            totalDiscount += i.getTtlDiscount();
        }
        
        //Calculate all totals necessary for receipt
        subTotal = (double)Math.round(subTotal * MONEY_ROUNDING) / MONEY_ROUNDING;
        totalDiscount = (double)Math.round(totalDiscount * MONEY_ROUNDING) / MONEY_ROUNDING;
        customerDiscount = (double)Math.round((customer.getCustomerDiscount() * (subTotal - totalDiscount)) * MONEY_ROUNDING) / MONEY_ROUNDING;
        customerTax = (double)Math.round(((subTotal - (customer.getCustomerDiscount() * subTotal)) * customer.getCustomerTax() ) * MONEY_ROUNDING) / MONEY_ROUNDING;
        totalWithDiscountAndTax = (double)Math.round((subTotal - totalDiscount - customerDiscount + customerTax) * MONEY_ROUNDING) / MONEY_ROUNDING;
        
        System.out.println("Print receipt...");
        System.out.println("TARGET");
        System.out.println("---------------------------------------------------");
        System.out.println("ID No. | Name          |Quant.| SubTotal | Discount" );
        System.out.println("---------------------------------------------------");
        for(LineItem i : lineItems){
            i.printLineItem();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("                                           SubTotal");
        for(int i = 0; i < PRINTING_COL_LENGTH - Double.toString(subTotal).length(); i++){
            System.out.print(" ");
        }
        System.out.println(subTotal);
        System.out.println("                               TotalProductDiscount");
        for(int i = 0; i < PRINTING_COL_LENGTH - Double.toString(totalDiscount).length() - NEGATIVE_DISPLACEMENT; i++){
            System.out.print(" ");
        }
        System.out.println("- " + totalDiscount);
        System.out.println("                                   CustomerDiscount");
        for(int i = 0; i < PRINTING_COL_LENGTH - Double.toString(customerDiscount).length() - NEGATIVE_DISPLACEMENT; i++){
            System.out.print(" ");
        }
        System.out.println("- " + customerDiscount);
        System.out.println("                                                Tax");
        for(int i = 0; i < PRINTING_COL_LENGTH - Double.toString(customerTax).length(); i++){
            System.out.print(" ");
        }
        System.out.println(customerTax);
        System.out.println("                                              Total");
        for(int i = 0; i < PRINTING_COL_LENGTH - Double.toString(totalWithDiscountAndTax).length(); i++){
            System.out.print(" ");
        }
        System.out.println(totalWithDiscountAndTax);
        System.out.println("---------------------------------------------------");
        System.out.println("Thank you for shopping at Target!");
    }

    @Override
    public void addProduct(String productID) {
        if(!checkForDuplicate(productID)){
            LineItem lineItem = new InStoreLineItem(productID);
            LineItem[] temp = new LineItem[lineItems.length + 1];
            System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
            temp[temp.length-1] = lineItem;
            lineItems = temp;
        }
    }
    
    public boolean checkForDuplicate(String productID){
        for(LineItem i : lineItems){
            if(i.checkForDuplicate(productID)){
                return true;
            }
        }
        
        return false;
    }
}
