/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_vitrtualproxy_image_v_h;

/**
 *
 * @author viktorooo
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String name;
    public ProxyImage(String name){
        this.name=name;
    }
    
    @Override
    public void displayImage() {
        if(realImage==null){
            realImage=new RealImage(name);
        }
        realImage.displayImage();
    }
    
}
