/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresp_naskuske;

/**
 *
 * @author ESKOPC
 */
public class ConcreteHandler1 extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequest() < 5000)
        {
            System.out.println("Vyplati Vas sekretarka.");
        }
        else
        {
            Handler handler = new ConcreteHandler2();
            handler.handleRequest(request);
        }
    }
    
}
