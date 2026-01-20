package ChainOfResponsibilityPrep;

public class ConcreteHandler2 implements Handler
{
    @Override
    public void handleRequest(Request request)
    {
        if (request.getRequestNumber() >= 5000 && request.getRequestNumber() <= 10000) System.out.println("Vyplati vas zastupca\n");
        else
        {
            Handler handler = new ConcreteHandler3();
            handler.handleRequest(request);
        }

    }
}
