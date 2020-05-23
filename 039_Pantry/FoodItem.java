public class FoodItem {
    private double amount;
    private String brand;
    private String weight;
    private String color;
    public FoodItem(double price, String type, String mass, String rainbow)
    {
        amount = price;
        brand = type;
        weight = mass;
        color = rainbow;
    }
    public void setAmount(double price)
    {
        amount = price;
    }
    public void setBrand(String type)
    {
        brand = type;
    }
    public void setWeight(String mass)
    {
        weight = mass;
    }
    public void setColor(String rainbow)
    {
        color = rainbow;
    }
    public double getAmount()
    {
        return amount;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getWeight()
    {
        return weight;
    }
    public String getColor()
    {
        return color;
    }
    public static void main(String[] args)
    {
        
    }
}