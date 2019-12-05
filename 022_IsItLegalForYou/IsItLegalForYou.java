import java.util.Scanner;
public class IsItLegalForYou
{
    public static void main(String[] args)
    {
        String gettingADriversLicense = "It is legal for you to get your drivers license in Minnesota";
        String buyingCigarettes = "It is legal for you to buy cigarettes in Minnesota";
        String goingToACasino = "It is legal for you to go to a Casino in Minnesota";
        String buyingAlcohol = "It is legal for you to buy Alcohol in Minnesota";
        String rentingACar = "It is legal for you to rent a car in Minnesota";
        //make a scanner to get the age of the person.//
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        double inputAge = scan.nextDouble();
        //if and one else statment to set up the defining ages//
        if (inputAge >= 16)
        {
            System.out.println(gettingADriversLicense);
        }
        if (inputAge >= 18)
        {
            System.out.println(buyingCigarettes);
            System.out.println(goingToACasino);
        }
        if (inputAge >= 21)
        {
            System.out.println(buyingAlcohol);
        }
        if (inputAge >= 25)
        {
            System.out.println(rentingACar);
        }
        else
        {
            System.out.println("You are too young, come back when you are older"); 
        }
        scan.close();
    }
}
