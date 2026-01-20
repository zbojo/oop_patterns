package VisitorPrep;

public class ConcreteVisitor implements Visitor
{

    @Override
    public void visit(Sus sus)
    {
        boolean reallySus = false;

        if (sus instanceof ConcreteElementA)
        {
            reallySus = ((ConcreteElementA) sus).isGuilty();

            if (reallySus) System.out.println("ConcreteElementA is guilty!\n");
            else System.out.println("ConcreteElementA is not guilty!");
        }
        else
        {
            System.out.println("ConcreteElementB is not guilty!..\n");
        }
    }
}
