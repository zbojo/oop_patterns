/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author ESKOPC
 */
public class Main {
    
    public static void main(String[] argv)
    {
        Image image1 = new ProxyImage("image_png_canonFX1265_8MB");
        Image image2 = new ProxyImage("image_png_panasonicC90_15MB");
        
        image1.displayImage(); // zobrazi sa aj loading, pretoze sa prvy krat vola konstruktor realimage
        image1.displayImage(); // loading sa uz nezobrazy lebo real v proxyimage uz nie je null uz sa len vypise
        image2.displayImage(); // prvy krat sa vola image2 = zobrazi sa aj loading aj displaying
        
        
    }
    
}
