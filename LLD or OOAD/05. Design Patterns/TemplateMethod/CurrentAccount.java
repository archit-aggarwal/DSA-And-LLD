package TemplateMethod;

public class CurrentAccount extends Account {

    @Override
    public double estimatedTaxCalculator(double annualIncome) {
        return (annualIncome * 0.05);
    }

    @Override
    public double incomeCalculator() {
        double revenue = 1000000000.0;
        return revenue;
    }

    @Override
    public double taxDeductionCalculator(double estimatedTax) {
        return estimatedTax * 0.98;
    }

}
