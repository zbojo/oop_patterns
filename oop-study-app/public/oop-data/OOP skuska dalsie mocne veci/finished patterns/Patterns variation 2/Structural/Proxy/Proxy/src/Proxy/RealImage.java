/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author ESKOPC
 */
public class RealImage implements Image{
    private String filename;
    
    public RealImage(final String filename)
    {
        this.filename = filename;
        loadImageFromDisc();
    }
    
    public final void loadImageFromDisc()
    {
        System.out.println("Loading... " + filename);
    }
    
    @Override
    public void displayImage() {
        System.out.println("Displaying... " + filename);
    }
    
}
