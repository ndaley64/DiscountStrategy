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
public class StandardCustomer implements Customer{
    private String customerID;
    private String fName;
    private String lName;
    private Date registerDate;

    public StandardCustomer(String customerID, String fName, String lName, Date registerDate) {
        this.setCustomerID(customerID);
        this.setFName(fName);
        this.setLName(lName);
        this.setRegisterDate(registerDate);
    }

    @Override
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        // need to write some validation
        this.customerID = customerID;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        // need to write some validation
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        // need to write some validation
        this.lName = lName;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        // need to write some validation
        this.registerDate = registerDate;
    }
    
    
}
