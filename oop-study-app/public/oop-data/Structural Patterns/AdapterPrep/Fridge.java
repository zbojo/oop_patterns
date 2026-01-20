package AdapterPrep;

public class Fridge implements Target
{
    private String fridgeContent;

    public Fridge()
    {
        this.fridgeContent = "rybacia konzerva, zoschnuty syr, flasa piva";
    }

    @Override
    public void scan()
    {
        System.out.println("Fridge contains: " + content());
    }

    public String content()
    {
        return this.fridgeContent;
    }
}
