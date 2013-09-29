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

    /**
     *
     * @param product
     */
    public void addProduct(final Product product){
        Product[] temp = new Product[products.length + 1];
        System.arraycopy(products, 0, temp, 0, products.length);
        temp[temp.length-1] = product;
        products = temp;
    }
    
    /**
     *
     * @param productID
     * @return
     */
    public Product retrieveProduct(final String productID){
        int productIndex = -1;
        
        for(int i = 0; i < products.length; i++){
            if(products[i].getProductID().equals(productID)){
                productIndex = i;
            }
        }
        
        return products[productIndex];
    }
}
