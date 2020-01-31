import java.util.Scanner;
public class SpellingBeeSimulator
{
    public static void main(String[] args)
    {
        /*learning how to use a for loop to print out a statement with conditions*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word please:  ");
        String spelling = scan.nextLine();
        System.out.println("The word you are spelling" + " " + spelling);
        /*for (String spelling : spelling.substring(0,1))
        {
            System.out.print(spelling + "-");
        }*/
        for (int i = 0; i < spelling.length(); i++)
        {
            /*char c = spelling.charAt(i);*/
            if (i >= spelling.length()-1)
            {
                System.out.println(spelling.charAt(i));
            }
            else 
            {
                System.out.print(spelling.charAt(i) + "-");
            }
        }
        scan.close();
    }
}