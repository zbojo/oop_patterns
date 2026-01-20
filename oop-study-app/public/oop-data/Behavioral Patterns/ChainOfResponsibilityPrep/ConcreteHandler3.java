package ChainOfResponsibilityPrep;

public class ConcreteHandler3 implements Handler
{
    @Override
    public void handleRequest(Request request)
    {
        if (request.getRequestNumber() > 10000 && request.getRequestNumber() <= 20000) System.out.println("Vyplati vas riaditel\n");
        else
        {
            Handler handler = new ConcreteHandler4();
            handler.handleRequest(request);
        }
    }
}
