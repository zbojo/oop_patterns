/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visitorproject;

import java.util.ArrayList;

/**
 *
 * @author Stevo
 */
public class VisitorProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pred tebou stoji 5 podozrivych, mas 2 policajtov a musis zistit, kto je vinny...");
        Visitor policajt1=new PresviedcaciPolicajt();
        Visitor policajt2=new PrehladavacPolicajt();
        Podozrivy p1 = new PodozrivyMlciaci("Ivan");
        Podozrivy p2 = new PodozrivyNedotknutelny("Juraj");
        Podozrivy p3 = new PodozrivyMlciaci("Gregor");
        Podozrivy p4 = new PodozrivyNedotknutelny("Ignac");
        Podozrivy p5 = new PodozrivyMlciaci("Golem");
        
        ArrayList<Podozrivy> zoznam=new ArrayList<Podozrivy>();
        zoznam.add(new PodozrivyMlciaci("Ivan"));
        zoznam.add(new PodozrivyNedotknutelny("Juraj"));
        zoznam.add(new PodozrivyMlciaci("Gregor"));
        zoznam.add(new PodozrivyNedotknutelny("Ignac"));
        zoznam.add(new PodozrivyMlciaci("Golem"));
        int i;
        for(Podozrivy naRade: zoznam){
        naRade.accept(policajt2);
        }
        
//        for(Podozrivy naRade: zoznam){
//        naRade.accept(policajt1);
//        }
        
    }
    
}
