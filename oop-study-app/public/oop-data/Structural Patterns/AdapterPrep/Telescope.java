package AdapterPrep;

public class Telescope implements Target
{

    private Star star;

    public Telescope(Star star)
    {
        this.star = star;
    }

    @Override
    public void scan()
    {
        System.out.println("Telescope sees: " + star.light());
    }
}
