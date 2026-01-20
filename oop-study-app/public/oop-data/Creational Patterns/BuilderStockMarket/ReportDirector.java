package BuilderStockMarket;

public class ReportDirector implements Director
{

    @Override
    public void construct(Builder builder)
    {
        builder.buildTitle();
        builder.buildValue();
        builder.buildDate();
    }
}
