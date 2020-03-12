import java.util.Scanner;
public class BasicNestedPractice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String character;
        int rows;
        int columnns;
        System.out.println("Enter a letter: ");
        character = scan.nextLine();
        System.out.println("Enter the number of rows: ");
        rows = scan.nextInt();
        System.out.println("Enter the number of columnns: ");
        columnns = scan.nextInt();
        if( character.length() > 1) {
            System.out.println("You can not use more than more character");
        }
        if(rows > 20 && columnns > 20) {
            System.out.println("You must only use less than 20 for both the rows and the columns");
        } else 
        {
            for(int i = 0; i < rows; i++)
            {
                for( int ii = 0; ii < columnns; ii++)
                {
                    System.out.print(character + " ");
                }
                System.out.println();
            }
        }

        
        
        
    }
}