package AbstractFactoryPrep;

public class ProductA2 implements AbstractProductA
{
    public ProductA2()
    {
        this.doAnything();
    }
    @Override
    public void doAnything() {
        System.out.println("vau vau");
    }
}
