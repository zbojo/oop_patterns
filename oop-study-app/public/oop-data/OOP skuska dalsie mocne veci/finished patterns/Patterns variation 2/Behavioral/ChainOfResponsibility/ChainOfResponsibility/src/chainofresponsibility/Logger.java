/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author ESKOPC
 */
public abstract class Logger {
    
    public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    protected int mask;
    
    protected Logger next; //dalsi objekt v retezci
    
    public void setNext(Logger next)
    {
        this.next = next;
    }
    
    public void message(String msg, int priority)
    {
        if(priority <= mask)
        {
            writeMessage(msg);
        }
        if(next != null)
        {
            next.message(msg, priority);
        }
    }
    
    abstract protected void writeMessage(String msg);
    
    
}
