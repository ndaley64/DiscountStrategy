/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author ndaley
 */
public class CashRegisterFactory {
    private static CashRegisterFactory instance;
    
    private CashRegisterFactory(){}
    
    public static CashRegisterFactory getInstance(){
        if(instance == null){
            instance = new CashRegisterFactory();
        }
        return instance;
    }
    
    public CashRegister getCashRegister(){
        return new CashRegister();
    }
}
