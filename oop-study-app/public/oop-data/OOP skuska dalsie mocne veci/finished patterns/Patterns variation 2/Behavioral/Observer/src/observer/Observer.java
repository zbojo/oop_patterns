/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

// The Observers update method is called when the Subject changes
public interface Observer {
    public void update(double ibmPrice, double aaplPrice, double googPrice);
}
