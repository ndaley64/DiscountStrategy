package version1;

/**
 *
 * @author Nathaniel
 */
public class ElectronicProduct implements Product{
    Discount discount;
    
    private String name;
    private String description;
    private double cost;
    private String brand;
    private int lifeSpanInYears;

    public ElectronicProduct(Discount discount, String name, String description, double cost, String brand, int lifeSpanInYears) {
        this.setDiscount(discount);
        this.setName(name);
        this.setDescription(description);
        this.setCost(cost);
        this.setBrand(brand);
        this.setLifeSpanInYears(lifeSpanInYears);
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        // need to write some validation
        this.discount = discount;
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

    public void setLifeSpanInYears(int lifeSpanInYears) {
        // need to write some validation
        this.lifeSpanInYears = lifeSpanInYears;
    }
    
}
