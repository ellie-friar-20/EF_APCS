import java.util.Random;
public class PowerAttack
{
    public static void main(String[] args)
    {
        /* used while loop to repeat program until it got to monsters armor class*/
        int strength = 3;
        Random strengthBonus = new Random();
        int bonus = strengthBonus.nextInt(10) + 1;
        System.out.println(bonus);
        int newStrength = bonus + strength;
        System.out.println("Your character's new strength is " + newStrength);
        while (newStrength < 11)
        {
            Random swingStrength = new Random();
            newStrength = swingStrength.nextInt(10) + 1;
            newStrength = newStrength + 3;
            System.out.println(newStrength);    
        }
        if (newStrength >= 11)
        {
            System.out.println("You swing your ax at the monster");
        }
    }
}