/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author ESKOPC
 */
public class ChainOfResponibilityExample {
    
    public static Logger createChain()
    {
        Logger logger = new StudLogger(Logger.DEBUG);
        
        Logger logger1 = new EmailLogger(Logger.NOTICE);
        logger.setNext(logger1);
        
        Logger logger2 = new StderrLogger(Logger.ERR);
        logger1.setNext(logger2);
        
        return logger;
    }
    
}
