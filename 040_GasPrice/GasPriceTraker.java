public class GasPriceTracker
{
    private double price;
    private String name;
    public GasPriceTracker(double price, String name)
    {
        this.name = name;
        this.price = price;
    }
    public double getPrice()
    {
        return this.price;
    }
    public String getName()
    {
        return this.name;
    }
    public static void main(String[] args)
    {
        
    }
}