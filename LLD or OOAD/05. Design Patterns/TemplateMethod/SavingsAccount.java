package TemplateMethod;

public class SavingsAccount extends Account {
    @Override
    public double estimatedTaxCalculator(double annualIncome) {
        return (annualIncome * 0.10);
    }

    @Override
    public double incomeCalculator() {
        double credit = 1000000;
        return credit;
    }

    @Override
    public double taxDeductionCalculator(double estimatedTax) {
        return estimatedTax * 1.00;
    }
}
