package BuilderStockMarket;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaxPriceReportBuilder implements Builder
{
    private Report report = new Report(null, 0, null);
    private List<Article> listOfArticles;

    public MaxPriceReportBuilder(List<Article> listOfArticles)
    {
        this.listOfArticles = listOfArticles;
    }

    @Override
    public void buildTitle()
    {
        report.setTitle("max price report");
    }

    @Override
    public void buildValue()
    {
        double highestPrice = 0.0;
        for (Article article : listOfArticles)
        {
            if (article.getPrice() > highestPrice)
            {
                highestPrice = article.getPrice();
            }
        }
        report.setValue(highestPrice);
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
