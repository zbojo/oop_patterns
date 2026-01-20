/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_decorator_postava_v_h;

/**
 *
 * @author hiro
 */
public class Mobil implements Component {
    
    private Component decoratedContent;
    
    public Mobil(Component decoratedContent){
        
    this.decoratedContent = decoratedContent;
        
    }

    @Override
    public String vypisCinnost() {
        return decoratedContent.vypisCinnost()+" a volam";
    }
    
}
