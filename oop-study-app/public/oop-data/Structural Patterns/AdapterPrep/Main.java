package AdapterPrep;

public class Main
{
    public static void main(String[] args)
    {
        Fridge fridge = new Fridge();
        fridge.scan();

        Star star = new Star();
        Telescope telescope = new Telescope(star);
        telescope.scan();

        Preparation preparation = new Preparation();
        Microscope microscope = new Microscope(preparation);
        microscope.scan();
    }
}
