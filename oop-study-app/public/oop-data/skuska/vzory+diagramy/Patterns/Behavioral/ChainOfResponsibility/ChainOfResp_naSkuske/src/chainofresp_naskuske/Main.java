/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresp_naskuske;

/**
 *
 * @author ESKOPC
 */
public class Main {
    
    public static void main(String[] args)
    {
        
        Request request = new Request();
        request.getRequestNumber();
        Handler handler = new ConcreteHandler1();
        handler.handleRequest(request);
    }
    
}
