import java.util.Scanner;
public class DateTranslator {
    /* takes the user input and decides which format it follows and then calls open method to print it out*/
    public static void main(String[] args) {
        String userInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the month: ");
        int month = scan.nextInt();
        System.out.println("Please input the day: ");
        int day = scan.nextInt();
        System.out.println("Please input the year: ");
        int year = scan.nextInt();
        System.out.println("Choose whether you want the American or European date format: ");
        String whichFormat = scan.next();
        if(whichFormat.equalsIgnoreCase("American"))
        {
            dateAmerican(month, day, year);
        } else if(whichFormat.equalsIgnoreCase("European"))
        {
            dateEuropean(day, month, year);
        } else
        {
            System.out.println("You need to start over incorrect input");
        }
    }
public static void dateAmerican(int month, int day, int year)
{
    System.out.println("Date:" + month + "/" + day + "/" + year);
}
public static void dateEuropean(int day, int month, int year)
{
    System.out.println("Date:" + day + "/" + month + "/" + year);
}
}