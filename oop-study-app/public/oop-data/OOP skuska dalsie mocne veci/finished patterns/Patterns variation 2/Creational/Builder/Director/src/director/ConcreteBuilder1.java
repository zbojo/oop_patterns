/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package director;

/**
 *
 * @author ESKOPC
 */
public class ConcreteBuilder1 implements Builder{

    private Product product = new Product();
    @Override
    public void buildPart() {
        product.setOblecenie("kruzkova kosela");
        product.setSpravanie("bojuj");
        product.setZbran("mec");
    }
    
    public Product getResult()
    {
        return product;
    }
    
}
