package BuilderChocolate;

public class CherrySecret implements Builder
{
    private Chocolate chocolate = new Chocolate("default", "default", "default");

    @Override
    public void buildBase()
    {
        chocolate.setBase("Cherry Base");
    }

    @Override
    public void buildFilling()
    {
        chocolate.setFilling("Cherry Filling");
    }

    @Override
    public void buildSprinkle()
    {
        chocolate.setSprinkle("Cherry Sprinkle");
    }

    public Chocolate getChocolate()
    {
        return this.chocolate;
    }
}
