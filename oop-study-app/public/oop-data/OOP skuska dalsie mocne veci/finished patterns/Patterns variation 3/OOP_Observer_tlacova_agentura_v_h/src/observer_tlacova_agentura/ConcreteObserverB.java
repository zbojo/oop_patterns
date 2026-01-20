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
public class ConcreteObserverB implements Observer{
    private ConcreteObserverable co;
    private String state;
    
    public ConcreteObserverB(ConcreteObserverable co){
        this.co=co;
        
        
    }
    @Override
    public void update() {
        this.state=co.getState();
        System.out.println("mail> "+this.state);
    }
}
