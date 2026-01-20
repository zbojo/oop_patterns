/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class ConcreteIterator implements Iterator{
    private ConcreteAggregate aggregate;
    private int current=0;
    public ConcreteIterator(ConcreteAggregate aggregate){
        this.aggregate=aggregate;
    }
    @Override
    public Osoba first() {
        //chyba osetrenie keby bol prazdny
        return aggregate.getZoznam().get(0);
        
    }

    @Override
    public Osoba next() {
        //chyba osetrenie keby bol prazdny a keby nemal dalsieho
        return aggregate.getZoznam().get(++current);
    }

    

    @Override
    public Osoba currentItem() {
        //chyba osetrenie keby bol prazdny
        return aggregate.getZoznam().get(current);
    }
    
}
