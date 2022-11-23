package TemplateMethod;

public class SalaryAccount extends Account {
    @Override
    public double estimatedTaxCalculator(double annualIncome) {
        return (annualIncome * 0.15);
    }

    @Override
    public double incomeCalculator() {
        double salary = 100000000;
        return salary;
    }

    @Override
    public double taxDeductionCalculator(double estimatedTax) {
        return estimatedTax * 0.90;
    }
}
