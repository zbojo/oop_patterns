/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresp_naskuske;

/**
 *
 * @author ESKOPC
 */
public class ConcreteHandler3 extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequest() >= 10000 && request.getRequest() < 20000)
        {
            System.out.println("Vyplati Vas riaditel.");
        }
        else
        {
            Handler handler = new ConcreteHandler4();
            handler.handleRequest(request);
        }
    }
    
}
