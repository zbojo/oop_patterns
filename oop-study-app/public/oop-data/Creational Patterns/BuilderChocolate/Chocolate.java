package BuilderChocolate;

public class Chocolate
{
    private String base;
    private String filling;
    private String sprinkle;

    public Chocolate(String base, String filling, String sprinkle)
    {
        this.base = base;
        this.filling = filling;
        this.sprinkle = sprinkle;
    }

    public String getBase()
    {
        return this.base;
    }

    public String getFilling()
    {
        return this.filling;
    }

    public String getSprinkle()
    {
        return this.sprinkle;
    }

    public void setBase(String base)
    {
        this.base = base;
    }

    public void setFilling(String filling)
    {
        this.filling = filling;
    }

    public void setSprinkle(String sprinkle)
    {
        this.sprinkle = sprinkle;
    }
}
