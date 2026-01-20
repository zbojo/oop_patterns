package BuilderStockMarket;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Article> listOfArticles = new ArrayList<>();
        listOfArticles.add(new Article("article1", 10, 154.78));
        listOfArticles.add(new Article("article2", 5, 548.78));

        ReportDirector reportDirector = new ReportDirector();
        StockValueReportBuilder stockBuilder = new StockValueReportBuilder(listOfArticles);
        MaxPriceReportBuilder maxBuilder = new MaxPriceReportBuilder(listOfArticles);

        reportDirector.construct(stockBuilder);
        reportDirector.construct(maxBuilder);

        System.out.println(stockBuilder.getReport().getTitle() + " " + stockBuilder.getReport().getValue() + " " + stockBuilder.getReport().getDate());
        System.out.println(maxBuilder.getReport().getTitle() + " " + maxBuilder.getReport().getValue() + " " + maxBuilder.getReport().getDate());
    }
}
