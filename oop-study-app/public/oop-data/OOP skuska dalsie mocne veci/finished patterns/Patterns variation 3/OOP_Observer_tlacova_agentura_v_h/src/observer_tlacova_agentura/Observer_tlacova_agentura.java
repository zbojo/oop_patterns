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
public class Observer_tlacova_agentura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConcreteObserverable co=new ConcreteObserverable();
        ConcreteObserverA A=new ConcreteObserverA(co);
        ConcreteObserverB B=new ConcreteObserverB(co);
        
        co.attach(A);
        co.attach(B);
        
        String sprava="ahoooj";
        co.setState(sprava);
        
        co.detach(B);
        
        sprava="caveees";
        co.setState(sprava);
        
    }
    
}
