/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author ESKOPC
 */
public class StudLogger extends Logger{
    
    
    public StudLogger(int mask)
    {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Writing to student: " + msg);
    }
    
    
}
