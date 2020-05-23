public class SumPositiveOrNegative
{
    public static void main(String[] args)
    {
        int totalPositive = 0;
        int totalNegatives = 0;
        OneThousandPositiveOrNegativeInts integers = new OneThousandPositiveOrNegativeInts();
        int[] thousand = integers.getOneThousandPositiveOrNegativeInts();
        for(int x : thousand)
        {
            if(x > 0)
            {
                totalPositive += x;
            }
            else 
            {
                totalNegatives += x;
            }
        }
        System.out.println("sum of positives =  " + totalPositive + " : sum of negatives = " + totalNegatives);
    }
}