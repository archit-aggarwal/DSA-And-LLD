package models;

public class Split {
    private String userID;
    private double amount;

    public Split(String debtor) {
        this.userID = debtor;
    }

    public String getUser() {
        return userID;
    }

    public void setUser(String userID) {
        this.userID = userID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
