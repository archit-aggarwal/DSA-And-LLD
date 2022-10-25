package models;

import java.util.*;

public class Dao {
    private Map<String, User> users;
    private Map<String, Map<String, Double>> balances;

    private static Dao instance = null;

    private Dao() {
        users = new HashMap<>();
        balances = new HashMap<>();
    }

    public static Dao getInstance() {
        if (instance == null) {
            instance = new Dao();
        }
        return instance;
    }

    public User getUser(String userID) {
        return users.get(userID);
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
        balances.put(user.getId(), new HashMap<String, Double>());
    }

    public void addExpense(String creditor, Split split) {
        String debtor = split.getUser();

        Map<String, Double> balanceMap = balances.get(creditor);
        balanceMap.put(debtor, balanceMap.getOrDefault(debtor, 0.0)
                + split.getAmount());

        balanceMap = balances.get(debtor);
        balanceMap.put(creditor, balanceMap.getOrDefault(creditor, 0.0)
                - split.getAmount());
    }

    public void showBalance(String user1) {
        boolean isEmpty = true;

        for (String user2 : balances.get(user1).keySet()) {
            double balance = balances.get(user1).get(user2);
            if (balance != 0) {
                printBalance(user1, user2, balance);
                isEmpty = false;
            }
        }

        if (isEmpty == true) {
            System.out.println("No balances");
        }

        System.out.println();
    }

    public void showBalances() {
        boolean isEmpty = true;

        for (String user1 : balances.keySet()) {
            Map<String, Double> balanceMap = balances.get(user1);
            for (String user2 : balanceMap.keySet()) {
                double balance = balanceMap.get(user2);
                if (balance > 0) {
                    printBalance(user1, user2, balance);
                    isEmpty = false;
                }
            }
        }

        if (isEmpty == true) {
            System.out.println("No balances");
        }

        System.out.println();
    }

    private void printBalance(String user1, String user2, double amount) {
        String user1Name = users.get(user1).getName();
        String user2Name = users.get(user2).getName();

        if (amount < 0) {
            System.out.println(user1Name + " owes " + user2Name + ": " + Math.abs(amount));
        } else if (amount > 0) {
            System.out.println(user2Name + " owes " + user1Name + ": " + Math.abs(amount));
        }
    }
}
