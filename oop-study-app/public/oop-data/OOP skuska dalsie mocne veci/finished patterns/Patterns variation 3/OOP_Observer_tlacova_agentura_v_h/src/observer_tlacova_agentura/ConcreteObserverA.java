/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer_tlacova_agentura;

/**
 *
 * @author viktorooo
 */
public class ConcreteObserverA implements Observer{
    private ConcreteObserverable co;
    private String state;
    
    public ConcreteObserverA(ConcreteObserverable co){
        this.co=co;
        
        
    }
    @Override
    public void update() {
        this.state=co.getState();
        System.out.println("sms> "+this.state);
    }
    
    
}
