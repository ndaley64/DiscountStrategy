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

    /**
     *
     * @param customerID
     * @param fName
     * @param lName
     * @param registerDate
     * @param tax
     */
    public StandardCustomer(final String customerID, final String fName, final String lName, 
                            final Date registerDate, final double tax) {
        setCustomerID(customerID);
        setFName(fName);
        setLName(lName);
        setRegisterDate(registerDate);
        setTax(tax);
        setDiscount(NO_DISCOUNT);
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
    public void setCustomerID(String customerID) {
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
    public void setFName(String fName) {
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
    public void setLName(String lName) {
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
    public void setRegisterDate(Date registerDate) {
        // need to write some validation
        this.registerDate = registerDate;
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
    public void setTax(double tax) {
        // need some validation
        this.tax = tax;
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
    public void setDiscount(double discount) {
        //need some validation
        this.discount = discount;
    }
    
    
}
