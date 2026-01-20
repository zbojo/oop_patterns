/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naskuskuiterator;

import java.util.LinkedList;

/**
 *
 * @author Stevo
 */
public class ConcreteAggregateLinkedList extends Aggregate {

    private LinkedList<Zamestnanec> zoznamZamestanncov;

    public ConcreteAggregateLinkedList() {
        zoznamZamestanncov = new LinkedList<Zamestnanec>();
    }

    @Override
    public ConcreteIteratorLinkedList createIterator() {
        return new ConcreteIteratorLinkedList(zoznamZamestanncov);
    }

    @Override
    public void addZamestnanec(Zamestnanec newZamestnanec) {
        zoznamZamestanncov.add(newZamestnanec);
    }

}
