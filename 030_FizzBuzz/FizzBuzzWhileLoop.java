public class FizzBuzzWhileLoop
{
    public static void main(final String[] args) {
        /*
         * while loop with if and else statements to check if conditions are true or not
         */
        final int num = 100;
        int count = 1;
        while (count <= num)
        {
            if (count % 5 == 0 && count % 3 == 0 )
            {
                System.out.println("Fizzbuzz");
            }
            else if (count % 5 == 0)
            {
                System.out.println("fizz");
            }
            else if (count % 3 == 0)
            {
                System.out.println("buzz");
            }
            else 
            {
                System.out.println(count);
            }
           count++;
        }
    }
}