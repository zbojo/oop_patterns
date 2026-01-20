package VisitorCalculateBasket;

public class PrintReceipt implements Visitor
{
    @Override
    public void visit(Article article)
    {
        System.out.println("Article visited with receipt: " + article.getDescription());
    }

    @Override
    public void visit(Voucher voucher)
    {
        System.out.println("Voucher visited with receipt: " + voucher.getDescription());
    }
}
