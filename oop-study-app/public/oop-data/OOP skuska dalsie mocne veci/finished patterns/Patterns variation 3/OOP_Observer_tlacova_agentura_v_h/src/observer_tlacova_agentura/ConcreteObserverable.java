/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observer_tlacova_agentura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viktorooo
 */
public class ConcreteObserverable implements Observerable_Subject {
    private String state;
    private List<Observer> observers = new ArrayList<>();
    
    
    public ConcreteObserverable(){
        
    }
    
    public String getState(){
        return this.state;
    }
    
    public void setState(String state){
        this.state=state;
        notif();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notif() {
        for(Observer o: observers){
            o.update();
        }
    }
    
    
    
    
    
}
