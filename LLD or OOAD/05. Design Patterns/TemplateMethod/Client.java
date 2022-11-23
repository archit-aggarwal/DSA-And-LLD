package TemplateMethod;

public class Client {
    public static void main(String[] args) {
        Account a1 = new SalaryAccount();
        System.out.println(a1.taxCalculator());

        Account a2 = new SavingsAccount();
        System.out.println(a2.taxCalculator());

        Account a3 = new CurrentAccount();
        System.out.println(a3.taxCalculator());
    }
}
