import java.util.Scanner;
public class SpellingBeeSimulator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word please:  ");
        String spelling = scan.nextLine();
        /*for (String spelling : spelling.substring(0,1))
        {
            System.out.print(spelling + "-");
        }*/
        for (int i = 0; i >= spelling.length()-1; i--)
        {
            System.out.println(spelling + "-");
        }
        scan.close();
    }
}