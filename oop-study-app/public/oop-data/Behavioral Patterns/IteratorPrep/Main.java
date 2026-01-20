package IteratorPrep;

public class Main
{
    public static void main(String[] args)
    {
        ConcreteAggregate robota = new ConcreteAggregate();
        robota.addZamestnanec(new Zamestnanec("Janko", "Hrasko", 1000000));
        robota.addZamestnanec(new Zamestnanec("Mirek", "Binas", 2000));
        robota.addZamestnanec(new Zamestnanec("Marek", "Horváth", 99999999));
        robota.addZamestnanec(new Zamestnanec("Norbert", "Ádám", 99999999));
        robota.addZamestnanec(new Zamestnanec("Tomás", "Kormaník", 0));
        robota.addZamestnanec(new Zamestnanec("Ján", "Genči", 0));
        robota.addZamestnanec(new Zamestnanec("Štefan", "Korečko", 999999));

        ConcreteIterator robotaIterator = robota.createIterator();

        while (!robotaIterator.isDone())
        {
            System.out.println("robotaIterator's index: " + robotaIterator.getIndex());
            System.out.println("Meno: " + robotaIterator.currentItem().getKrstneMeno());
            System.out.println("Priezvisko: " + robotaIterator.currentItem().getPriezvisko());
            System.out.println("Plat: " + robotaIterator.currentItem().getPlat());
            System.out.println("\n");
            robotaIterator.next();
        }
    }
}
