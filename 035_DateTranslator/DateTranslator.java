import java.util.Scanner;
public class DateTranslator {
    public static void userInput() {
        String userInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the month, the day, and the year you want: ");
        userInput = scan.nextLine();
    }
}