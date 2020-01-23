import java.util.Scanner;
public class SimpleCounter 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any integer: ");
        int inputInt = scan.nextInt();
        int i = 0;
        while (i <= inputInt){
            System.out.println(i);
            i++;
        }
        scan.close();
    }
}