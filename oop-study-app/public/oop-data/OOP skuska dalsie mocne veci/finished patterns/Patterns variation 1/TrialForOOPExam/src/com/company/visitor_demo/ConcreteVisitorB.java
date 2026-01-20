package com.company.visitor_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ConcreteVisitorB implements Visitor{

    private Boolean g;
    @Override
    public void visit(Element element){
        if(element instanceof ConcreteElement2){
            System.out.println("Visitor B - Element 2");
            g = ((ConcreteElement2) element).getVina2();
            if(g){
                System.out.println("Vinny");
            }else{
                System.out.println("Nevinny");
            }
        } else{
            System.out.println("Visitor B - Element 1");
        }
    }

}