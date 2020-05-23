public class GassSign
{
    public static void main(String[] args)
    {
        GasPriceTracker unleaded = new GasPriceTracker(2.49, "unleaded");
        GasPriceTracker premium = new GasPriceTracker(2.79, "premium");
        GasPriceTracker plus = new GasPriceTracker(2.99, "plus");
        System.out.println(unleaded.getName() + " , " + unleaded.getPrice());
        System.out.println(plus.getName() + " , " + unleaded.getPrice());
        System.out.println(premium.getName() + " , " + unleaded.getPrice());
    }
}