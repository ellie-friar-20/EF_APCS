public class TabletopDice
{
    public static void main(String[] args)
    {
        //cast called double into int and then put it through math random and added plus one so that the range doesnt include zero but then includes the through the number needed//
        int d4 = (int) (Math.random() * 4 + 1); 
        int d6 = (int) (Math.random() * 6 + 10);
        int d8 = (int)(Math.random() * 8 + 1);
        int d10 = (int)(Math.random() * 10 + 1);
        int percentile = (int)(Math.random() * 10 * 10);
        int d12 = (int)(Math.random()* 12 + 1);
        int d20 = (int)(Math.random() * 20 + 1); 
        System.out.println("The four sided dice equals: " + d4);
        System.out.println("The six sided dice equals: " + d6);
        System.out.println("The eight sided dice equals: " + d8);
        System.out.println("The ten sided dice equals: " + d10);
        System.out.println("The percentile dice equals: " + percentile);
        System.out.println("The twelve sided dice equals: " + d12);
        System.out.println("The twenty sided dice equals: " +  d20);


        
    }
}