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

    public PantsClothingProduct(double waistSize, double length, Discount discount, String name, String description, double cost, String brand) {
        super(discount, name, description, cost, brand);
        this.setWaistSize(waistSize);
        this.setLength(length);
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
