public class AverageDiceRolls
{
    public void findAverageDiceValue()
    {
        int sum = 0;
        OneThousandDiceRolls die = new OneThousandDiceRolls();
        int[] dieRolls = die.getDiceRolls();
        for( int x: dieRolls)
        {
            sum =+ x;
        }
        System.out.println("average roll = " + (sum / 1000));
    }
    public static void main(String[] args) 
    {
        AverageDiceRolls y = new AverageDiceRolls();
        y.findAverageDiceValue();
    }
}