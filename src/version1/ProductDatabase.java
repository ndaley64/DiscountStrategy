/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author Nathaniel
 */
public class ProductDatabase implements Database{
    private Product[] products;

    public void addProduct(Product product){
        Product[] temp = new Product[products.length + 1];
        System.arraycopy(products, 0, temp, 0, products.length);
        temp[temp.length-1] = product;
        products = temp;
    }
}
