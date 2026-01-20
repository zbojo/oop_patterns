package BuilderPrep;

public class ConcreteBuilder2 implements Builder
{
    private Product product = new Product();
    @Override
    public void buildPart()
    {
        this.product.setOblecenie("ine oblecenie");
        this.product.setGun("glock");
        this.product.setName("vau");
    }

    public Product getResult()
    {
        return this.product;
    }
}
