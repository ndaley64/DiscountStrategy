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
    private Customer[] customers = new Customer[3];

    public void addCustomer(Customer customer){
        Customer[] temp = new Customer[customers.length + 1];
        System.arraycopy(customers, 0, temp, 0, customers.length);
        temp[temp.length-1] = customer;
        customers = temp;
    }
}
