package services;

import models.Dao;

public class ShowBalanceService {
    Dao balances;

    public ShowBalanceService() {
        balances = Dao.getInstance();
    }

    public void showBalance(String userID) {
        balances.showBalance(userID);
    }

    public void showAllBalances() {
        balances.showBalances();
    }
}
