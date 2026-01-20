/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class Adapter extends AdapteeList implements TargetStack{
    
    public Adapter(){}
    
    @Override
    public void push(String o) {
        insertTail(o);
        
    }

    @Override
    public void pop() {
        removeTail();
    }
    
}
