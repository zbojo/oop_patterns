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
public class RealImage implements Image{
    private String name;
    
    public RealImage(String name){
        this.name=name;
        System.out.println("nacitavam obrazok "+ name +" z disku");
    }

    @Override
    public void displayImage() {
        System.out.println("zobrazujem obrazok "+name);
    }
    
}
