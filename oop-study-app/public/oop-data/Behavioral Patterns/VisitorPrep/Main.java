package VisitorPrep;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Visitor police = new ConcreteVisitor();

        ArrayList<Sus> susList = new ArrayList<>();
        susList.add(new ConcreteElementA("Filip Šverha - dc: Allan Karlsson"));
        susList.add(new ConcreteElementA("Jozef Džubák - dc: dzuby"));
        susList.add(new ConcreteElementB("dajaky debil"));
        susList.add(new ConcreteElementB("opity tipek"));

        for (Sus debilko : susList)
        {
            if (debilko instanceof ConcreteElementA) System.out.println(((ConcreteElementA)debilko).getName());
            else System.out.println(((ConcreteElementB)debilko).getName());
            debilko.accept(police);
        }
    }
}
