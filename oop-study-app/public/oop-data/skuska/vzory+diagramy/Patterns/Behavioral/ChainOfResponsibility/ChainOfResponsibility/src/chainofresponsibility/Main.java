/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author ESKOPC
 */
public class Main {
    
    
    public static void main(String[] args)
    {
        Logger chain = ChainOfResponibilityExample.createChain();
        
        chain.message("Entering function y.", Logger.DEBUG);
        
        chain.message("Step1 completed.", Logger.NOTICE);
 
        chain.message("An error has occurred.", Logger.ERR);
    }
    
}
