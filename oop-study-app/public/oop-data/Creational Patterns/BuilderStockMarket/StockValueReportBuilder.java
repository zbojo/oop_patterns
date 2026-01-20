package BuilderStockMarket;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class StockValueReportBuilder implements Builder
{
    private Random random = new Random();
    private Report report = new Report(null, 0, null);
    private List<Article> listOfArticles;

    public StockValueReportBuilder(List<Article> listOfArticles)
    {
        this.listOfArticles = listOfArticles;
    }

    @Override
    public void buildTitle()
    {
        report.setTitle("stock value report");
    }

    @Override
    public void buildValue()
    {
        double price = 0.0;
        for (Article article : listOfArticles)
        {
            price += article.getPrice();
        }
        report.setValue(price);
    }

    @Override
    public void buildDate()
    {
        report.setDate(new Date());
    }

    public Report getReport()
    {
        return report;
    }
}
