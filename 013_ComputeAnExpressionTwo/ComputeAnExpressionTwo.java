public class ComputeAnExpressionTwo
{
    public static void main(String[] args)
    {
        /*double nineFive = 9.5;
        double fourFive = 4.5;
        double twoFive = 2.5;
        double threeFive = 3.5;
        double fourtyFive = 45.5;
        double three = 3;
        double answer = (((nineFive * fourFive) - (twoFive * three)) / (fourtyFive - threeFive));
        System.out.println("The Answer is " + answer);*/
        ReturningCalculator calc = new ReturningCalculator();
        double nineFive = 9.5;
        double fourFive = 4.5;
        double twoFive = 2.5;
        double threeFive = 3.5;
        double fourtyFive = 45.5;
        double three = 3;
        double math = calc.doubleMultiplier(nineFive, fourFive);
        double red = calc.doubleMultiplier(twoFive,three);
        double multiplySubtract = calc.doubleSubtractor(math, red);
        double subtract = calc.doubleSubtractor(fourtyFive, threeFive);
        System.out.println("The answer is " + calc.divider(multiplySubtract, subtract));
    } 
}