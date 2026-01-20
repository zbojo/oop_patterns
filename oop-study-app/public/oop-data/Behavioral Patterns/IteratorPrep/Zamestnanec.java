package IteratorPrep;

public class Zamestnanec
{
    private String krstneMeno;
    private String priezvisko;
    private int plat;

    public Zamestnanec(String newKrstneMeno, String newPriezvisko, int newPlat)
    {
        this.setKrstneMeno(newKrstneMeno);
        this.setPriezvisko(newPriezvisko);
        this.setPlat(newPlat);
    }

    public String getKrstneMeno()
    {
        return this.krstneMeno;
    }

    public String getPriezvisko()
    {
        return this.priezvisko;
    }

    public int getPlat()
    {
        return this.plat;
    }

    public void setKrstneMeno(String krstneMeno)
    {
        this.krstneMeno = krstneMeno;
    }

    public void setPriezvisko(String priezvisko)
    {
        this.priezvisko = priezvisko;
    }

    public void setPlat(int plat)
    {
        this.plat = plat;
    }
}
