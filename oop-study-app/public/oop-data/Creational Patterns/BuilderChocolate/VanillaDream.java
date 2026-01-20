package BuilderChocolate;

public class VanillaDream implements Builder
{
    private Chocolate chocolate = new Chocolate("default", "default", "default");

    @Override
    public void buildBase()
    {
        chocolate.setBase("Vanilla Base");
    }

    @Override
    public void buildFilling()
    {
        chocolate.setFilling("Vanilla Filling");
    }

    @Override
    public void buildSprinkle()
    {
        chocolate.setSprinkle("Vanilla Sprinkle");
    }

    public Chocolate getChocolate()
    {
        return this.chocolate;
    }
}
