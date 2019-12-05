public class MaximumIntegers
{
    public static void main(String[] args)
    {
        //using wrapper class to change the value of the variables//
        System.out.println("Integer Max Value: " + Integer.MAX_VALUE);
        System.out.println("Integer Min Value: " + Integer.MIN_VALUE);
        Integer max = new Integer(Integer.MAX_VALUE + 2147483647 + 1000002);
        System.out.println(max);
        Integer min = new Integer(Integer.MIN_VALUE + -2147483648 + 745);
        System.out.println(min);
    }
}