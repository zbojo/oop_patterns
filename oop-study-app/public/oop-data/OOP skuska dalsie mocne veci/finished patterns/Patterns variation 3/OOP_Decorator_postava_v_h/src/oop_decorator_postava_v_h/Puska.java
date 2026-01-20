/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_decorator_postava_v_h;

/**
 *
 * @author viktorooo
 */
public class Puska implements Component {
    
    private Component decoratedComponent;
    
    public Puska(Component decoratedContent){
        this.decoratedComponent=decoratedContent;
    }

    @Override
    public String vypisCinnost() {
        return decoratedComponent.vypisCinnost()+" a strielam";
    }
    
}
