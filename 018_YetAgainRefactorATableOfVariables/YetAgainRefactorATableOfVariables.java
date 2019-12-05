 import java.util.Scanner;
public class YetAgainRefactorATableOfVariables
{
    public static void main(String[] args)
    {
        double theOne = 1;
        double theTwo = 2;
        double theThree = 3;
        double theFour = 4;
        /*int sumFour = theTwo * theTwo;
        int sumEight = theTwo * theTwo * theTwo;
        int sumNine = theThree * theThree;
        int sumTwentySeven = theThree * theThree * theThree;
        int sumSixteen = theFour * theFour * theFour;
        int sumSixtyFour = theFour * theFour * theFour * theFour * theFour;*/
        //changed the system so that math pow takes the doubles and raises them to the power of the seond one//
        System.out.println("a\ta^2\ta^3");
        System.out.println(theOne + "\t" + Math.pow(theOne, theTwo) + "\t" +  Math.pow(theOne, theThree));
        System.out.println(theTwo + "\t"+ Math.pow(theTwo, theTwo) + "\t"+ Math.pow(theTwo, theThree));
        System.out.println(theThree + "\t"+ Math.pow(theThree, theTwo) + "\t" +  Math.pow(theThree, theThree));
        System.out.println(theFour + "\t"+ Math.pow(theFour, theTwo) + "\t" + Math.pow(theFour, theThree));
        //created a scanner that takes the row you entered and outputs the answer in a double then procceds to use a similar structure of math pow as above//
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row you would like to see: ");
        double answer = scan.nextDouble();
        System.out.println(Math.pow(answer,theOne) + "\t" + Math.pow(answer, theTwo) +"\t'" + Math.pow(answer, theThree));
    }
}