package PrototypePrep;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Class implements Prototype
{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public Prototype makeCopy() {
        try
        {
            return (Prototype) this.clone();
        }
        catch (CloneNotSupportedException e) {
            Logger.getLogger(Class.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}
