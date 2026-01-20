package BuilderStockMarket;

import java.util.Date;

public class Report
{
    private String title;
    private double value;
    private Date date;

    public Report(String title, double value, Date date)
    {
        this.title = title;
        this.value = value;
        this.date = date;
    }

    public String getTitle()
    {
        return title;
    }

    public double getValue()
    {
        return value;
    }

    public Date getDate()
    {
        return date;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
}
