class ProfessionalTaxCalculator {
    private double salary;

    public ProfessionalTaxCalculator(double salary) {
        this.salary = salary;
    }

    public double calculateProfessionalTax() {
        if (salary <= 10000.00) {
            return 0.0;
        } else if (salary <= 25000.00) {
            return 100.0;
        } else if (salary <= 50000.00) {
            return 200.0;
        } else if (salary <= 75000.00) {
            return 300.0;
        } else if (salary <= 100000.00) {
            return 450.0;
        } else {
            return 650.0;
        }
    }
}

public class exp3 {
    public static void main(String[] args) {
        double salary = 30000.00; // Example salary amount

        ProfessionalTaxCalculator calculator = new ProfessionalTaxCalculator(salary);
        double professionalTax = calculator.calculateProfessionalTax();

        System.out.println("Professional Tax: " + professionalTax);
    }
}
