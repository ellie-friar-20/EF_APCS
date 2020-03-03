import java.util.Scanner;
public class CustomCalculator 
{
    /*created a calculator with different functions that go through system of if and else statments based on user input to define what method is used*/
    public static double customAdd(double a, double b) {
        return(a + b);
    }
    public static double customSubtract(double a, double b) {
        return(a - b);
    }
    public static double customDivide(double a, double b ) {
        return(a / b);
    }
    public static double customMultiply(double a, double b) {
        return(a * b);
    }
    public static double customSquare(double a) {
        return(a * a);
    }
    public static double customAreaOfSquare(double b) {
        return Math.pow(b,2);
    }
    public static double customAreaOfRectangle(double a, double b) {
        return(a * b);
    }
    public static double customExponent(double a, double b) {
        return Math.pow(a , b);
    }
    public static void main(String[] args) 
    {
        String choiceFunction = "";
        int choiceOne;
        int choiceTwo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter what you want the calculator to do. Your options are add, subtract, divide, multiply, square, area of a square, area of a rectangle and exponent: ");
        choiceFunction = scan.nextLine();
        System.out.println("What would you like your variable A to be: ");
        choiceOne = scan.nextInt();
        System.out.println("What would you like your variable B to be: ");
        choiceTwo = scan.nextInt();
        if(choiceFunction.equalsIgnoreCase("add")) {
            System.out.println("The answer is " + customAdd(choiceOne, choiceTwo));
        }
        else if(choiceFunction.equalsIgnoreCase("subtract")) {
            System.out.println("The answer is " + customSubtract(choiceOne, choiceTwo));
        }
        else if(choiceFunction.equalsIgnoreCase("multiply")) {
            System.out.println("The answer is " + customMultiply(choiceOne, choiceTwo));
        }
        else if(choiceFunction.equalsIgnoreCase("divide")) {
            System.out.println("The answer is " + customDivide(choiceOne, choiceTwo));
        }
        else if(choiceFunction.equalsIgnoreCase("square")) {
            System.out.println("The answer is " + customSquare(choiceOne));
        }
        else if(choiceFunction.equalsIgnoreCase("area of a square")) {
            System.out.println("The answer is " + customAreaOfSquare(choiceTwo));
        }
        else if(choiceFunction.equalsIgnoreCase("area of a rectangle")) {
            System.out.println("The answer is " + customAreaOfRectangle(choiceOne, choiceTwo));
        }
        else if(choiceFunction.equalsIgnoreCase("exponent")) {
            System.out.println("The answer is " + customExponent(choiceOne, choiceTwo));
        }
        else
        {
            System.out.println("You have entered something incorrectly, try again");
        }
        scan.close();
    }
}

