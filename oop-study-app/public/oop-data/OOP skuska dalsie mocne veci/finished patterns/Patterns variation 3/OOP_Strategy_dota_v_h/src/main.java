/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hrdina hrdina1=new Hrdina("hrdina 1");
        Hrdina hrdina2=new Hrdina("hrdina 2");
        
        hrdina1.setStrategy(new Spravanie1());
        hrdina2.setStrategy(new Spravanie2());
        
        hrdina1.request();
        hrdina2.request();
        
        hrdina1.setStrategy(new Spravanie2());
        hrdina1.request();
    }
    
}
