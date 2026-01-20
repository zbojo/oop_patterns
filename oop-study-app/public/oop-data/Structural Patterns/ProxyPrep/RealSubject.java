package ProxyPrep;

public class RealSubject implements Subject
{
    private String name;

    public RealSubject(String name)
    {
        this.name = name;
    }

    @Override
    public void doSomething()
    {
        System.out.println("RealSubject doSomething");
    }

    public String getName()
    {
        return name;
    }

    public void printName()
    {
        System.out.println("RealSubject name: " + name);
    }
}
