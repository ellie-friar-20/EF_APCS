public class FizzBuzzForLoop
{
    public static void main(String[] args)
    {
        /* for loop with system of if and else if statements that define when the integar changes in the loop*/
        /*int fizzBuzz = 1;*/
        for (int i = 1; i <= 100; i++)
        {
    
            if (i%15 == 0) 
            {
                System.out.println("Fizzbuzz");
            } 
            else if (i%5 == 0)
            {
                System.out.println("Buzz");
            } 
            else if (i%3 == 0)
            {
                System.out.println("Fizz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}