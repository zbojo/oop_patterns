/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author ESKOPC
 */
public class EmailLogger extends Logger{
    
    public EmailLogger(int mask)
    {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sending via Email: " + msg);
    }
    
}
