import java.util.Scanner;
public class ShippingCalculator
{
    public static void main(String[] args)
    {
        //make a scanner to enter the weight of the package//
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the weight of the package you wish to ship: ");
        double weight = scan.nextDouble();
        //create system of if statments that include and disclude weights to make them their right prices. use and to make it so that you can define the if statement by two things//
        if (weight <= 0)
        {
            System.out.println("Invalid Input");
        }
        if ((0 < weight) & (weight <= 1))
        {
            System.out.println("Your total will be $3.50 for shipping.");
        }
        if ((1 < weight) & (weight <= 3))
        {
            System.out.println("Your total will be $5.50 for shipping.");
        }
        if ((3 < weight) & (weight <= 10))
        {
            System.out.println("Your total will be $8.50 for shipping.");
        }
        if ((10 < weight) & (weight <= 20)) 
        {
            System.out.println("Your total will be $10.50 for shipping.");
        }
        if (weight > 20)
        {
            System.out.println("This package cannot be shipped.");
        }
    }
}