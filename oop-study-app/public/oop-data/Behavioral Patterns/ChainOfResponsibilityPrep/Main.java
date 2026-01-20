package ChainOfResponsibilityPrep;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Request request = new Request();
        Handler handler = new ConcreteHandler1();
        handler.handleRequest(request);
    }
}
