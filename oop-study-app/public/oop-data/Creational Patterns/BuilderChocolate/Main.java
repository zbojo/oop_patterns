package BuilderChocolate;

public class Main
{
    public static void main(String[] args)
    {
        NewTastesCenter tastesCenter = new NewTastesCenter();
        VanillaDream vanilla = new VanillaDream();
        CherrySecret cherry = new CherrySecret();


        tastesCenter.construct(vanilla);
        tastesCenter.construct(cherry);

        Chocolate vanillaProduct = vanilla.getChocolate();
        Chocolate cherryProduct = cherry.getChocolate();

        System.out.println("Vanilla chocolate: " + vanillaProduct.getBase() + " " + vanillaProduct.getFilling()  + " "  + vanillaProduct.getSprinkle());
        System.out.println("Cherry chocolate: " + cherryProduct.getBase()  + " "  + cherryProduct.getFilling()  + " "  + cherryProduct.getSprinkle());

    }
}
