package BuilderPrep;

public class ConcreteBuilder implements Builder
{
    private Product product = new Product();
    @Override
    public void buildPart()
    {
        this.product.setOblecenie("oblecenie");
        this.product.setGun("ak47");
        this.product.setName("meow");
    }

    public Product getResult()
    {
        return this.product;
    }
}
