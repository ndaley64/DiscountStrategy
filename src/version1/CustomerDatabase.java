/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author Nathaniel
 */
public class CustomerDatabase implements Database{
    private Customer[] customers = new Customer[1];

    
    public void addCustomer(Customer customer){
        System.out.println(customers.length);
        //customers[customer.length] = customer;
    }
}
