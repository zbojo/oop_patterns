package ChainOfResponsibilityPrep;

public class ConcreteHandler4 implements Handler
{
    @Override
    public void handleRequest(Request request)
    {
        if (request.getRequestNumber() > 20000) System.out.println("Vasa poziadavka je prilis velka!!!!!!!!!!!!!\n");
    }
}
