import java.util.Scanner;
public class LoanCalculator 
{
    public static void main(String[] args)
    {
        //created doubles put into scanner printed with multiply and divide//
        double monthlyinterest = 0;
        double principalBalance = 0;
        double annualInterestRate = 0;
        double remainingMonths = 0;
        double monthlyPayment = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your principal balance:  ");
        principalBalance = scan.nextDouble();
        System.out.println("Enter your annual interest rate:  ");
        annualInterestRate = scan.nextDouble();
        System.out.println("Enter your remaining months:  ");
        remainingMonths = scan.nextDouble();
        monthlyinterest = principalBalance * (annualInterestRate/remainingMonths);
        System.out.println("Your monthly interest is " + monthlyinterest);
        System.out.println("Your monthly payment is " + principalBalance/remainingMonths + monthlyinterest);
        scan.close();






    }
}