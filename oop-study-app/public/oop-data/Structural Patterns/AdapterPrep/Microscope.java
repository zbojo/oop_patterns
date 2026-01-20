package AdapterPrep;

public class Microscope implements Target
{

    private Preparation preparation;

    public Microscope(Preparation preparation)
    {
        this.preparation = preparation;
    }


    @Override
    public void scan()
    {
        System.out.println("Microscope sees: " + preparation.tissue());
    }
}
