package AbstractFactoryPrep;

public class ProductA1 implements AbstractProductA
{
    public ProductA1()
    {
        this.doAnything();
    }
    @Override
    public void doAnything() {
        System.out.println("Meow meow A");
    }
}
