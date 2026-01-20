/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author ESKOPC
 */
public class ProxyImage implements Image{
    private RealImage real = null;
    private String filename;
    
    public ProxyImage(final String filename)
    {
        this.filename = filename;
    }

    @Override
    public void displayImage() {
        if(real == null){
            real = new RealImage(filename);
        }
        real.displayImage();
    }
    
   
    
    
}
