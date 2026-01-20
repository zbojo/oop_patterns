package BuilderChocolate;

public class NewTastesCenter implements Director
{
    public NewTastesCenter()
    {

    }


    @Override
    public void construct(Builder builder)
    {
        builder.buildBase();
        builder.buildFilling();
        builder.buildSprinkle();
    }
}
