/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author ndaley
 */
public class AbstractFactory {
    
    public static CashRegister getCashRegisterInstance() {
        CashRegister cr = CashRegisterFactory.getInstance().getCashRegister();
        return cr;
    }
}
