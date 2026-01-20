/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESKOPC
 */
public class CompositeGraphic implements Graphic{
    
    private List<Graphic> graphicList = new ArrayList<>();

    @Override
    public void print() {
        for(Graphic gr: graphicList) //foreach
        {
            gr.print();
        }
    }

    /* ALEBO CEZ ITERATOR
    @Override
    public void print()
    {
        Iterator<Graphic> it = graphicList.iterator();
        while(it.hasNext() )
        {
            Graphic gr = it.next();
            gr.print();
        }
    }
    */
    public void add(Graphic gr)
    {
        graphicList.add(gr);
    }
    
    public void remove(Graphic gr)
    {
        graphicList.remove(gr);
    }
    
}
