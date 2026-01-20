/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESKOPC
 */
public class PersonItarator implements Iterator{
    
    private int current = 0;

    @Override
    public boolean hasNext() {
        if(PersonCollection.persons.size() == current)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public Person getNext() {
        return PersonCollection.persons.get(current++);
    }

    @Override
    public Person First() {
        return PersonCollection.persons.get(0);
    }

    @Override
    public Person Last() {
        return PersonCollection.persons.get(PersonCollection.persons.size()-1);
    }
    
    
}
