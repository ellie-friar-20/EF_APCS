public class ComputeAnExpression
{
    public static void main(String[] args)
    {
        //creating a program to self commpute a problem//
        double nineFive = 9.5;
        double fourFive = 4.5;
        double twoFive = 2.5;
        double threeFive = 3.5;
        double fourtyFive = 45.5;
        double three = 3;
        double answer = (((nineFive * fourFive) - (twoFive * three)) / (fourtyFive - threeFive));
        System.out.println("The Answer is " + answer);
    }

}