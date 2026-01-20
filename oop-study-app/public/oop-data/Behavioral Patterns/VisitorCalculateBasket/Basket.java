package VisitorCalculateBasket;

import java.util.ArrayList;
import java.util.List;

public class Basket
{
    private List<Element> elements = new ArrayList<>();

    public Basket()
    {
        this.elements = elements;
    }

    public void buyArticle(Article article)
    {
        elements.add(article);
    }

    public void applyVoucher(Voucher voucher)
    {
        elements.add(voucher);
    }

    public List<Element> getElements()
    {
        return this.elements;
    }
}
