package VisitorCalculateBasket;

public class CalculateTotal implements Visitor
{
    private static double total = 0;

    @Override
    public void visit(Article article)
    {
        total += article.getPrice();
    }

    @Override
    public void visit(Voucher voucher)
    {
        total -= voucher.getPrice();
    }

    public double getTotal()
    {
        return this.total;
    }
}
