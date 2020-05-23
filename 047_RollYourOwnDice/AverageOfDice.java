import java.util.*;
public class AverageOfDice
{
    ArrayList<Integer> numberOfRolls = new ArrayList<Integer>();
    static double average = 0;
    public int dice()
    {
        return(int)(Math.random()*100)+ 1;
    }
    public void addRoll(int side)
    {
        double diceTotal = 0;
        System.out.println("Your roll is " + side);
        numberOfRolls.add(side);
        for(int x : numberOfRolls)
        {
            diceTotal += x;
        }
        double average = diceTotal / numberOfRolls.size();
    }
    public static void main(String[] args)
    {
        AverageOfDice rollDice = new AverageOfDice();
        Scanner  scan = new Scanner(System.in);
        String roll;
        System.out.println("Would you like to roll the dice ?");
        roll = scan.nextLine().toLowerCase();
        while(roll.equals("yes"))
        {
            if(roll.equals("yes"))
            {
                rollDice.addRoll(rollDice.dice());
            }
            else
            {
                System.out.println("you may have entered a wrong answer try again !");
            }
           scan.close();
           System.out.println("Average of dice rolls equals = " + average);
        }
    }
}