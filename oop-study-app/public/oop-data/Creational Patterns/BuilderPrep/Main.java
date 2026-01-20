package BuilderPrep;

public class Main
{
    public static void main(String[] args)
    {
        Director director = new Director();

        ConcreteBuilder builder = new ConcreteBuilder();
        ConcreteBuilder2 builder2 = new ConcreteBuilder2();

        director.construct(builder);
        director.construct(builder2);

        System.out.println(builder.getResult().getOblecenie());
        System.out.println(builder.getResult().getGun());
        System.out.println(builder.getResult().getName());

        System.out.println(builder2.getResult().getOblecenie());
        System.out.println(builder2.getResult().getGun());
        System.out.println(builder2.getResult().getName());


    }
}
