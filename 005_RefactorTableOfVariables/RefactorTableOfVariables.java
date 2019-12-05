public class RefactorTableOfVariables
{
    public static void main(String[] args)
    //the program is being simplified through using multiplication to take about all the extra variables as well as the fact that I created variables for the frist column//
    {
        int theOne = 1;
        int theTwo = 2;
        int theThree = 3;
        int theFour = 4;
        int sumFour = theTwo * theTwo;
        int sumEight = theTwo * theTwo * theTwo;
        int sumNine = theThree * theThree;
        int sumTwentySeven = theThree * theThree * theThree;
        int sumSixteen = theFour * theFour * theFour;
        int sumSixtyFour = theFour * theFour * theFour * theFour * theFour;
        System.out.println("a\ta^2\ta^3");
        System.out.println(theOne + "\t" + theOne + "\t" + theOne);
        System.out.println(theTwo + "\t"+ sumFour + "\t"+ sumEight);
        System.out.println(theThree + "\t"+ sumNine + "\t" + sumTwentyseven);
        System.out.println(theFour + "\t"+ sumSixteen + "\t" + sumSixtyfour);
    }

}
