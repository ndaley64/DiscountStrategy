package version1;

/**
 *
 * @author Nathaniel
 */
public class ElectronicProduct implements Product{
    private Discount discount;
    
    private String productID;
    private String name;
    private String description;
    private double price;
    private String brand;
    private int lifeSpanInYears;

    /**
     *
     * @param discount
     * @param productID
     * @param name
     * @param description
     * @param price
     * @param brand
     * @param lifeSpanInYears
     */
    public ElectronicProduct(final Discount discount, final String productID, final String name, 
                            final String description, final double price, final String brand, final int lifeSpanInYears) {
        setDiscount(discount);
        setProductID(productID);
        setName(name);
        setDescription(description);
        setPrice(price);
        setBrand(brand);
        setLifeSpanInYears(lifeSpanInYears);
    }

    /**
     *
     * @return
     */
    public Discount getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     */
    public void setDiscount(final Discount discount) {
        // need to write some validation
        this.discount = discount;
    }

    /**
     *
     * @return
     */
    @Override
    public String getProductID() {
        return productID;
    }

    /**
     *
     * @param productID
     */
    public void setProductID(final String productID) {
        // need to write some validation
        this.productID = productID;
    }

    /**
     *
     * @return
     */
    @Override
    public String getProductName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(final String name) {
        // need to write some validation
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(final String description) {
        // need to write some validation
        this.description = description;
    }

    /**
     *
     * @return
     */
    @Override
    public double getProductPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(final double price) {
        // need to write some validation
        this.price = price;
    }

    /**
     *
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     */
    public void setBrand(final String brand) {
        // need to write some validation
        this.brand = brand;
    }

    /**
     *
     * @param lifeSpanInYears
     */
    public void setLifeSpanInYears(final int lifeSpanInYears) {
        // need to write some validation
        this.lifeSpanInYears = lifeSpanInYears;
    }

    /**
     *
     * @param numProducts
     * @return
     */
    @Override
    public double getProductDiscount(final double numProducts) {
        return (this.getDiscount().getDiscount(numProducts));
    }
    
}
