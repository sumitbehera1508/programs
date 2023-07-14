import java.util.Scanner;

class InterestCalculator {
    private double principalAmount;
    private double interestRate;

    public InterestCalculator(double principalAmount, double interestRate) {
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
    }

    public double calculateSimpleInterest(int timePeriod) {
        double monthlyInterestRate = interestRate / 12 / 100;
        return principalAmount * monthlyInterestRate * timePeriod;
    }

    public double calculateCompoundInterest(int timePeriod) {
        int numberOfCompounds = 4; // Quarterly compounding
        double quarterlyInterestRate = interestRate / numberOfCompounds / 100;
        double totalAmount = principalAmount * Math.pow(1 + quarterlyInterestRate, numberOfCompounds * timePeriod);
        return totalAmount - principalAmount;
    }
}

public class exp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();

        InterestCalculator calculator = new InterestCalculator(principalAmount, interestRate);

        System.out.print("Enter the time period (in months): ");
        int timePeriod = scanner.nextInt();

        double simpleInterest = calculator.calculateSimpleInterest(timePeriod);
        double compoundInterest = calculator.calculateCompoundInterest(timePeriod);

        System.out.println("Simple Interest payable monthly: " + simpleInterest);
        System.out.println("Compound Interest payable annually compounded quarterly: " + compoundInterest);

        scanner.close();
    }
}
