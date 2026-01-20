package ChainOfResponsibilityPrep;

import java.io.DataInputStream;
import java.io.IOException;

public class Request
{
    private int requestNumber;

    public int getRequestNumber()
    {
        return requestNumber;
    }

    public Request() throws IOException
    {
        System.out.println("Kolko chces platit bazdmeg?: ");
        DataInputStream data = new DataInputStream(System.in);

        if (data != null)
        {
            requestNumber = Integer.parseInt(data.readLine());
            System.out.println("Zadali ste input: " + requestNumber);
        }
        else System.out.println("Zly input!!!\n");
    }
}
