/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author ESKOPC
 */
public class StderrLogger extends Logger{
    
    public StderrLogger(int mask)
    {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sending to Stderr: " + msg);
    }    
}
