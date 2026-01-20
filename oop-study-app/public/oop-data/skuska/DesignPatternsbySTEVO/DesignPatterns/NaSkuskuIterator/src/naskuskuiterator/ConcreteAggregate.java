/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package naskuskuiterator;

import java.util.ArrayList;


/**
 *
 * @author Stevo
 */
public class ConcreteAggregate extends Aggregate{

    public ConcreteAggregate(){
    zoznamZamestnancov=new ArrayList<Zamestnanec>();
    }
    
    @Override
    public ConcreteIterator createIterator() {
        return new ConcreteIterator(zoznamZamestnancov);
    }

    @Override
    public void addZamestnanec(Zamestnanec newZamestnanec) {
        zoznamZamestnancov.add(newZamestnanec);
    }
    
}
