import java.util.Scanner;
public class RPSOne
{
    public static void main(String[] args)
    {
        //created strings to determine values based on random generator through if statments and then scanner for the person input//
        String person = " ";
        int computer = (int)Math.random()*3 + 1;
        String computerChoice = " ";
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets play Rock, Paper, Scissors. Enter your choice:  ");
        person = scan.nextLine();
        person = person.toLowerCase();
        scan.close();
        if (computer == 1)
        {
            computerChoice = "rock";
        }
         else if (computer == 2)
        {
            computerChoice = "scissors";
        }
        else if (computer == 3)
        {
            computerChoice = "paper";
        }
        System.out.println(computerChoice);



        if (person.equals(computerChoice))
        {
            System.out.println("its a tie!");
        }
        else if (person.equals("rock"))
            if (computerChoice.equals("scissors"))
            {
                System.out.println("Rock crushes scissors. You win!");
            }
            else {
                System.out.println("Paper smothers rock. you lose!");
            }
        else if (person.equals("paper"))
            if (computerChoice.equals("rock"))
            {
                System.out.println("Paper smothers rock. You win!");
            }  
            else 
            {
            System.out.println("Scissors cut paper. You lose!");
            }
        else if (person.equals("scissors"))
            if (computerChoice.equals("paper"))
            {
                System.out.println("Scissors beats paper. You win!");
            }
            else 
            {
                System.out.println("Scissors get crushed by rock. You win!");
            }
        }
}

