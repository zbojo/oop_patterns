/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresp_naskuske;

/**
 *
 * @author ESKOPC
 */
public class ConcreteHandler2 extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequest() >= 5000 && request.getRequest() < 10000)
        {
            System.out.println("Vyplati Vas zastupca riaditela.");
        }
        else
        {
            Handler handler = new ConcreteHandler3();
            handler.handleRequest(request);
        }
    }
    
}
