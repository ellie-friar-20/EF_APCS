import java.util.Scanner;
public class CarBuilderOne
{
    public static void main(String[] args)
    {
        /*String year = " ";
        String mileage = " ";
        String make = " ";
        String model = " ";*/
        //scanner used to print out the values contained in the various parts with the car class that i built//
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the make of the car you want:  ");
        String make = scan.nextLine();
        System.out.println("Enter the model of the car you want:  ");
        String model = scan.nextLine();
        System.out.println("Enter the mileage of the car you want; ");
        int mileage = scan.nextInt();
        System.out.println("Enter the year of the car you want:  ");
        int year = scan.nextInt();
        scan.close();
        Car personChoice = new Car(mileage, year, make, model);
        System.out.println("We found the car you requested: " + personChoice.manufacturerName + " " +  personChoice.modelName + " " + personChoice.year + " " +  personChoice.milesDriven);



    }
}