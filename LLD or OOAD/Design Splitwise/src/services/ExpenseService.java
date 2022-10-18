package services;

import java.util.*;
import models.*;

public class ExpenseService {
    private Dao expenses;
    private String creditorID;
    private double totalAmount;
    private List<Split> splits;
    private ExpenseType type;

    public ExpenseService(String creditorID, double totalAmount, int debtorCount) {
        this.expenses = Dao.getInstance();
        this.creditorID = creditorID;
        this.totalAmount = totalAmount;
        this.splits = new ArrayList<>(debtorCount);
    }

    public void addSplit(String debtorID) {
        splits.add(new Split(debtorID));
    }

    public void setAmount(int count, double splitAmount) {
        splits.get(count).setAmount(type.calcAmount(this.totalAmount, splitAmount));
    }

    public ExpenseType getType() {
        return type;
    }

    public void setType(ExpenseType type) {
        this.type = type;
    }

    public void addExpense() {
        if (type.validate(totalAmount, splits) == false) {
            System.out.println("Invalid Splits");
            return;
        }

        for (Split split : splits) {
            expenses.addExpense(creditorID, split);
        }
    }
}
