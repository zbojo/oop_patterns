package ChainOfResponsibilityPrep;


public class ConcreteHandler1 implements Handler
{
    @Override
    public void handleRequest(Request request)
    {
        if (request.getRequestNumber() < 5000) System.out.println("Vyplati vas dajaky chudobnejsi");
        else
        {
            Handler handler = new ConcreteHandler2();
            handler.handleRequest(request);
        }
    }
}
