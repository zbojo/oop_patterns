package VisitorCalculateBasket;

public interface Visitor
{
    void visit(Article article);
    void visit(Voucher voucher);
}
