package SingletonPrep;

public class Main
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(5);
        singleton.printData();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setData(10);
        singleton2.printData();

        singleton.printData();
    }


}
