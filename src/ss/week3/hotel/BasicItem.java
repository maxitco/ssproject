package ss.week3.hotel;

public class BasicItem implements Bill.Item {
    private String content;
    private double value;
    
    public BasicItem(String text, double amount)
    {
        this.content = text;
        this.value = amount;
    }
    
    public double getAmount()
    {
        return this.value;
    }
    
    public String toString()
    {
        return content;
    }
}
