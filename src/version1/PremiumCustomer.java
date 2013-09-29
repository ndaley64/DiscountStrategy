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

    /**
     *
     * @param customerID
     * @param fName
     * @param lName
     * @param registerDate
     * @param upgradeDate
     * @param tax
     * @param discount
     */
    public PremiumCustomer(final String customerID, final String fName, final String lName, 
                           final Date registerDate, final Date upgradeDate, final double tax, final double discount) {
        setCustomerID(customerID);
        setFName(fName);
        setLName(lName);
        setRegisterDate(registerDate);
        setUpgradeDate(upgradeDate);
        setTax(tax);
        setDiscount(discount);
    }

    /**
     *
     * @return
     */
    @Override
    public double getCustomerTax() {
        return tax;
    }

    /**
     *
     * @param tax
     */
    public void setTax(final double tax) {
        // need some validation
        this.tax = tax;
    }

    /**
     *
     * @return
     */
    @Override
    public String getCustomerID() {
        return customerID;
    }

    /**
     *
     * @param customerID
     */
    public void setCustomerID(final String customerID) {
        // need to write some validation
        this.customerID = customerID;
    }

    /**
     *
     * @return
     */
    public String getFName() {
        return fName;
    }

    /**
     *
     * @param fName
     */
    public void setFName(final String fName) {
        // need to write some validation
        this.fName = fName;
    }

    /**
     *
     * @return
     */
    public String getLName() {
        return lName;
    }

    /**
     *
     * @param lName
     */
    public void setLName(final String lName) {
        // need to write some validation
        this.lName = lName;
    }

    /**
     *
     * @return
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     *
     * @param registerDate
     */
    public void setRegisterDate(final Date registerDate) {
        // need to write some validation
        this.registerDate = registerDate;
    }

    /**
     *
     * @return
     */
    public Date getUpgradeDate() {
        return upgradeDate;
    }

    /**
     *
     * @param upgradeDate
     */
    public void setUpgradeDate(final Date upgradeDate) {
        // need to set validation
        this.upgradeDate = upgradeDate;
    }

    /**
     *
     * @return
     */
    @Override
    public double getCustomerDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     */
    public void setDiscount(final double discount) {
        // need to set validation
        this.discount = discount;
    }
    
}
