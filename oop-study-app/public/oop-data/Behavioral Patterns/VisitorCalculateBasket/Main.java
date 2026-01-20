package VisitorCalculateBasket;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Article toy = new Article("basic toy", 5);
        Article doll = new Article("doll", 4);
        double totalPriceInitial = toy.getPrice() + doll.getPrice();
        System.out.println("initial price of items: " + totalPriceInitial);

        Voucher kupon = new Voucher("zlava", 3);

        Basket basket = new Basket();
        basket.buyArticle(toy);
        basket.buyArticle(doll);
        basket.applyVoucher(kupon);

        CalculateTotal totalPrice = new CalculateTotal();
        PrintReceipt receiptPrinter = new PrintReceipt();

        List<Element> basketElements = basket.getElements();

        for (Element element : basketElements)
        {
            if (element instanceof Article)
            {
                totalPrice.visit((Article)element);
                receiptPrinter.visit((Article)element);
            }
            else if (element instanceof Voucher)
            {
                totalPrice.visit((Voucher)element);
                receiptPrinter.visit((Voucher)element);
            }
        }

        System.out.println("Total price after applying voucher: " + totalPrice.getTotal());
    }
}
