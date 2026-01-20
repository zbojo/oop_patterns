package SingletonPrep;

public class Singleton
{
    private static Singleton instance = null;

    private int data;

    private Singleton()
    {
        this.data = 0;
    }

    public static Singleton getInstance()
    {
        if (instance == null) instance = new Singleton();
        return instance;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public void printData()
    {
        System.out.println("Data => " + this.data);
    }
}
