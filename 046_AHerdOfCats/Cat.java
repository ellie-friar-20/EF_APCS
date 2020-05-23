public class Cat
{
    private String catName;
    private String catType;
    private double catWeight;
    public Cat(String catName, String catType, double catWeight)
    {
        this.catName = catName;
        this.catType = catType;
        this.catWeight = catWeight;
    }
    public void setCatName(String name)
    {
        catName = name;
    }
    public void setCatWeight(double weight)
    {
        catWeight = weight;
    }
    public void setCatType(String type)
    {
        catType = type;
    }
    public String getCatName()
    {
        return catName;
    }
    public double getCatWeight()
    {
        return catWeight;
    }
    public String getCatType()
    {
        return catType;
    }
    public static void main(String[] args)
    {
        
    }
}