/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author Nathaniel
 */
public class PantsClothingProduct extends ClothingProduct{
    private double waistSize;
    private double length;

    public PantsClothingProduct(Discount discount, String productID, String name, String description, double cost, String brand, double waistSize, double length) {
        super(discount, productID, name, description, cost, brand);
        setWaistSize(waistSize);
        setLength(length);
    }

    public double getWaistSize() {
        return waistSize;
    }

    public void setWaistSize(double waistSize) {
        // need to write some validation
        this.waistSize = waistSize;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        // need to write some validation
        this.length = length;
    }
    
    
}
