/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AdapteeList list = new AdapteeList();
        Adapter stack = new Adapter();
        
        stack.push("ahoj0");
        stack.push("ahoj1");
        stack.push("ahoj2");
        stack.push("ahoj3");
        
        System.out.println(stack.getList().size());
        
        stack.pop();
        
        System.out.println(stack.getList().size());
        
        
    }
    
}
