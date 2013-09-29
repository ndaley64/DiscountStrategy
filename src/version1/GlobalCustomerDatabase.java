/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

import java.util.Date;

/**
 *
 * @author Nathaniel
 */
public class GlobalCustomerDatabase implements Database{
    private Customer[] customers;
    
    /**
     *
     */
    public GlobalCustomerDatabase(){
        customers = new Customer[0];
        Customer customer = new StandardCustomer("CBAS1234", "John", "Doe", new Date(), .01);
        addCustomer(customer);
        customer = new StandardCustomer("JCKA8604", "Juniper", "Writher", new Date(), .01);
        addCustomer(customer);
        customer = new PremiumCustomer("PREM2503", "George", "Banks", new Date(), new Date(), .01, .05);
        addCustomer(customer);
    }
    
    /**
     *
     * @param customer
     */
    public void addCustomer(final Customer customer){
        Customer[] temp = new Customer[customers.length + 1];
        System.arraycopy(customers, 0, temp, 0, customers.length);
        temp[temp.length-1] = customer;
        customers = temp;
    }
    
    /**
     *
     * @param customerID
     * @return
     */
    public Customer retrieveCustomer(final String customerID){
        int customerIndex = -1;
        
        for(int i = 0; i < customers.length; i++){
            if(customers[i].getCustomerID().equals(customerID)){
                customerIndex = i;
            }
        }
        
        return customers[customerIndex];
    }
}
