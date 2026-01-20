
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESKOPC
 */
public class PersonCollection {
    
    public static List<Person> persons = new ArrayList();
    
    public PersonItarator Iterator()
    {
        return new PersonItarator();
    }
    
    public void add(Person p)
    {
        persons.add(p);
    }
    
    
}
