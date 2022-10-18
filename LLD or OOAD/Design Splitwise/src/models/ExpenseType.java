package models;

import java.util.List;

public enum ExpenseType {
    EQUAL {
        @Override
        public double calcAmount(double amount, double countSplit) {
            return amount / countSplit;
        }
    },
    EXACT {
        @Override
        public double calcAmount(double amount, double exactSplit) {
            return exactSplit;
        }
    },
    PERCENT {
        @Override
        public double calcAmount(double amount, double percentSplit) {
            return (amount * percentSplit) / 100.0;
        }
    };

    public abstract double calcAmount(double totalAmount, double split);

    public boolean validate(double totalAmount, List<Split> splits) {
        double sumSplit = 0.0;
        for (Split split : splits) {
            sumSplit += split.getAmount();
        }

        return ((sumSplit - totalAmount) <= 0.1);
    }
}
