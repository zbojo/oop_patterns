/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresp_naskuske;

/**
 *
 * @author ESKOPC
 */
public class ConcreteHandler4 extends Handler{

    @Override
    public void handleRequest(Request request) {
        if(request.getRequest() >= 20000)
        {
            System.out.println("Vasa poziadavka je prilis vysoka.");
        }
    }
    
    
}
