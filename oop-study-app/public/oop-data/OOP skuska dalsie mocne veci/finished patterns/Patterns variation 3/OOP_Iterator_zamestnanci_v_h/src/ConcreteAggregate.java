
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class ConcreteAggregate implements Aggregate {
    private List<Osoba> zoznam = new ArrayList<>();
    
    public ConcreteAggregate(){
        
    }
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    
    public List<Osoba> getZoznam(){
        return this.zoznam;
    }
    
    public void pridajOsobu(Osoba osoba){
        zoznam.add(osoba);
    }
    
}
