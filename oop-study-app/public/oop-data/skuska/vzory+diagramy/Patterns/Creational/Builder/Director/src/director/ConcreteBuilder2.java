/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package director;

/**
 *
 * @author ESKOPC
 */
public class ConcreteBuilder2 implements Builder{

    private Product product = new Product();
    
    @Override
    public void buildPart() {
        product.setOblecenie("platena kosela");
        product.setZbran("motyka");
        product.setSpravanie("utakaj");
    }
    
    public Product getResult()
    {
        return product;
    }
    
    
    
}
