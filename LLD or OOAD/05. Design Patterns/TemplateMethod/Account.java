package TemplateMethod;

public abstract class Account {
    public double taxCalculator() {
        double annualIncome = incomeCalculator();
        double estimatedTax = estimatedTaxCalculator(annualIncome);
        double taxDeduction = taxDeductionCalculator(estimatedTax);
        return taxDeduction;
    }

    public abstract double incomeCalculator();

    public abstract double estimatedTaxCalculator(double annualIncome);

    public abstract double taxDeductionCalculator(double estimatedTax);
}

