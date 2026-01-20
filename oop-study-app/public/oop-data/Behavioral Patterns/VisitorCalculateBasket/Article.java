package VisitorCalculateBasket;

public class Article implements Element
{
    private String description;
    private double price;

    public Article(String description, double price)
    {
        this.description = description;
        this.price = price;
    }

    public String getDescription()
    {
        return this.description;
    }

    public double getPrice()
    {
        return this.price;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
