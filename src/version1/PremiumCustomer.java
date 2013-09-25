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
public class PremiumCustomer implements Customer{
    private String customerID;
    private String fName;
    private String lName;
    private Date registerDate;
    private Date upgradeDate;
    private double discount;
    private double tax;

    public PremiumCustomer(String customerID, String fName, String lName, Date registerDate, Date upgradeDate, double tax, double discount) {
        setCustomerID(customerID);
        setFName(fName);
        setLName(lName);
        setRegisterDate(registerDate);
        setUpgradeDate(upgradeDate);
        setTax(tax);
        setDiscount(discount);
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        // need some validation
        this.tax = tax;
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

    public Date getUpgradeDate() {
        return upgradeDate;
    }

    public void setUpgradeDate(Date upgradeDate) {
        // need to set validation
        this.upgradeDate = upgradeDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        // need to set validation
        this.discount = discount;
    }
    
}
