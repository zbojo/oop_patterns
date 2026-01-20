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
public class Maintest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Create images");
        ProxyImage image1 = new ProxyImage("Photo1");
        ProxyImage image2 = new ProxyImage("Photo2");
        System.out.println("Use images");
        image1.displayImage();
        image1.displayImage();
        image2.displayImage();
        image2.displayImage();
        image1.displayImage();
    }

}
