/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ESKOPC
 */
public class Person {
    
    
    private int age;
    private String meno;
    
    public Person(int age, String meno)
    {
        this.meno = meno;
        this.age = age;
    }
    
    public String getName()
    {
        return meno;
    }
    
    public int getAge()
    {
        return age;
    }
    
}
