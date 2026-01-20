package com.company.visitor_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ConcretevsitorA implements Visitor{
    private Boolean g;

    @Override
    public void visit(Element element) {
        if (element instanceof ConcreteElement1){
            System.out.println("Visitor A - Element 1");
            g = ((ConcreteElement1)element).getVina1();
            if(g){
                System.out.println("Vinny");
            } else{
                System.out.println("Nevinny");
            }
        } else{
            System.out.println("Visitor A - Element 2");
        }
    }
}
