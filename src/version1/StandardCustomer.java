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
    private final double NO_DISCOUNT = 0;
    
    private String customerID;
    private String fName;
    private String lName;
    private Date registerDate;
    private double tax;
    private double discount;

    public StandardCustomer(String customerID, String fName, String lName, Date registerDate, double tax) {
        setCustomerID(customerID);
        setFName(fName);
        setLName(lName);
        setRegisterDate(registerDate);
        setTax(tax);
        setDiscount(NO_DISCOUNT);
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

    @Override
    public double getCustomerTax() {
        return tax;
    }

    public void setTax(double tax) {
        // need some validation
        this.tax = tax;
    }

    @Override
    public double getCustomerDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        //need some validation
        this.discount = discount;
    }
    
    
}
