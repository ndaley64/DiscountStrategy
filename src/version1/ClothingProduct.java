package version1;

/**
 *
 * @author Nathaniel
 */
public class ClothingProduct implements Product{
    Discount discount;
    
    private String productID;
    private String name;
    private String description;
    private double cost;
    private String brand;

    public ClothingProduct(Discount discount, String productID, String name, String description, double cost, String brand) {
        this.setDiscount(discount);
        this.setProductID(productID);
        this.setName(name);
        this.setDescription(description);
        this.setCost(cost);
        this.setBrand(brand);
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        // need to write some validation
        this.discount = discount;
    }
    
    @Override
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        // need to write some validation
        this.productID = productID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // need to write some validation
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        // need to write some validation
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        // need to write some validation
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        // need to write some validation
        this.brand = brand;
    }
    
    
}
